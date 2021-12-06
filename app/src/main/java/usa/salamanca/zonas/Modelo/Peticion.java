package usa.salamanca.zonas.Modelo;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Peticion {
    //Indica el tipo de peticion GET,POST,PUT,DELETE ya que se manejan por numeros
    private Integer metodoRequest;
    //Indica la url a la que se le hara la peticion
    private String url;
    //Indica la informacion que va a enviar en caso de que sea POST,PUT, O DELETE
    private JSONObject data;
    //Contendra los items que le devuelva el servidor
    private JSONArray answer;
    //Indica un metodo que se ejecutara en caso de que la consulta tenga exito
    private Response.Listener<JSONObject> listenerExito;
    //Indica un metodo que se ejecutara en caso de que la consulta sufra algun fallo
    private Response.ErrorListener listenerFailed;
    //Indicar si hubo o no error
    private boolean error;
    //Se encargara de hacer la peticion al servidor
    private JsonObjectRequest request;

    //Inicializamos los componentes
    public Peticion(){
        this.metodoRequest = Request.Method.GET;
        this.url = "";
        this.data = null;
        this.answer = null;
        this.listenerExito = null;
        this.listenerFailed = null;
        this.error = false;
        this.request = null;
    }
    //Metodo que retorna el tipo de metodo que se ejecutara en la consulta
    public Integer getMetodoRequest(){ return this.metodoRequest; }
    //Metodo que modifica el tipo de metodo que utilizara cuando se haga la consulta
    public void setMetodoRequest(Integer metodoRequest){ this.metodoRequest = metodoRequest; }
    //Metodo que retorna la url a la que se le intentara establecer conexion
    public String getUrl(){ return this.url; }
    //Metodo que modifica la url a la que se le intentara establecer conexion
    public void setUrl(String url){ this.url = url; }
    //Metodo que retorna la informacion que se va a enviar al servidor
    public JSONObject getData(){ return this.data; }
    //Metodo que modifica la informacion que se va a enviar al servidor
    public void setData(JSONObject data){ this.data = data; }
    //Metodo que retorna los items que devolvio el servidor
    public JSONArray getAnswerObject(){ return this.answer; }
    //Metodo que retorna si hubo algun error
    public boolean getError(){ return this.error; }

    //Metodo que Inicializa los metodos en caso de exito o fracaso
    private void iniciarlizarListeners(){
        try {
            this.listenerExito = new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        answer = response.getJSONArray("items");
                        error = false;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        error = true;
                    }
                }
            };
             this.listenerFailed = new Response.ErrorListener(){
                @Override
                public void onErrorResponse(VolleyError Error){
                    Error.printStackTrace();
                    error = true;
                }
            };
        }catch (Exception error){
            error.printStackTrace();
            this.error = true;
        } finally {
            this.listenerExito = null;
            this.listenerFailed = null;
        }
    }

    //Metodo que retorna si hubo alguno error cuando se envio la informacion al servidor
    public boolean send() {
        try {
            iniciarlizarListeners();
            this.request = new JsonObjectRequest(this.metodoRequest, this.url, this.data, this.listenerExito, this.listenerFailed);
            this.error = false;
        } catch (Exception Error) {
            Error.printStackTrace();
            this.error = true;
        } finally {
            this.request = null;
        }
        return !this.getError();
    }

}

package usa.salamanca.zonas.Controlador;

import com.android.volley.Request;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import usa.salamanca.zonas.Modelo.Categoria;
import usa.salamanca.zonas.Modelo.Peticion;

public class ControladorPrincipal {

    private static Peticion peticion;
    private static ControladorModelo controladorModelo;

    public static ArrayList<Categoria> extraerCategorias() throws JSONException {
        controladorModelo = new ControladorModelo();
        peticion = new Peticion();
        peticion.setUrl("https://g89c5192027b183-zonasdata.adb.us-sanjose-1.oraclecloudapps.com/ords/admin/categorias/categoria");
        if(peticion.getAnswerObject() != null){
            return controladorModelo.getCategoria(peticion.getAnswerObject());
        } else return null;
    }

    public static void registrarUsuario(JSONObject informacion){
        controladorModelo = new ControladorModelo();
        peticion = new Peticion();
        peticion.setUrl("https://g89c5192027b183-zonasdata.adb.us-sanjose-1.oraclecloudapps.com/ords/admin/api/usuarios/usuarios");
        peticion.setData(informacion);
        peticion.setMetodoRequest(Request.Method.POST);
        peticion.send();
    }

}

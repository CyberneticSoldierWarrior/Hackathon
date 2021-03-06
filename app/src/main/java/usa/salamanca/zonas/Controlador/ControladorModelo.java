package usa.salamanca.zonas.Controlador;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import usa.salamanca.zonas.Modelo.Categoria;
import usa.salamanca.zonas.Modelo.Etiqueta;
import usa.salamanca.zonas.Modelo.User;

public class ControladorModelo {

    public ArrayList<Categoria> getCategoria(JSONArray categoria) throws JSONException {
        ArrayList<Categoria> categoriaList = new ArrayList<Categoria>();
        if(categoria != null && categoria.length() > 0){
            for(int i = 0; i < categoria.length(); i++){
                Categoria nuevo  = new Categoria();
                JSONObject objeto = categoria.getJSONObject(i);
                nuevo.setNombrecat(objeto.getString("nombrecat"));
                categoriaList.add(nuevo);
            }
        }
        return categoriaList;
    }

    public ArrayList<Etiqueta> getEtiqueta(JSONArray etiqueta) throws JSONException{
        ArrayList<Etiqueta> etiquetaList = new ArrayList<>();
        if(etiqueta != null && etiqueta.length() > 0){
            for(int i = 0; i < etiqueta.length(); i++){
                Etiqueta nuevo  = new Etiqueta();
                JSONObject objeto = etiqueta.getJSONObject(i);
                nuevo.setEtiqueta(objeto.getString("etiqueta"));
                etiquetaList.add(nuevo);
            }
        }
        return etiquetaList;
    }

}

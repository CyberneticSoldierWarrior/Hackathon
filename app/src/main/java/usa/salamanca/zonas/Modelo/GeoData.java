package usa.salamanca.zonas.Modelo;

public class GeoData {

    private String longitud;

    private String latitud;

    public GeoData(){
        this.longitud = "";
        this.latitud = "";
    }

    public String getLongitud(){ return this.longitud; }

    public void setLongitud(String longitud){ this.longitud = longitud; }

    public String getLatitud(){ return this.latitud; }

    public void setLatitud(String latitud){ this.latitud = latitud; }

}

package usa.salamanca.zonas.Modelo;

public class User {;

    private String firstname;

    private String lastname;

    private Integer age;

    private Integer movetype;

    private String email;

    private String clave;

    public User(){
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
        this.movetype = 0;
        this.email = "";
        this.clave = "";
    }

    public String getFirstname(){ return this.firstname; }

    public void setFirstname(String firstname){ this.firstname = firstname; }

    public String getLastname(){ return this.lastname; }

    public void setLastname(String lastname){ this.lastname = lastname; }

    public Integer getAge(){ return this.age; }

    public void setAge(Integer age){ this.age = age; }

    public Integer getMovetype(){ return this.movetype; }

    public void setMovetype(Integer movetype){ this.movetype = movetype; }

    public String getEmail(){ return this.email; }

    public void setEmail(String email){ this.email = email; }

    public String getClave(){ return this.clave; }

    public void setClave(String clave) { this.clave = clave; }

}

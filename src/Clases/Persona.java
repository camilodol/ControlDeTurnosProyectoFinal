package Clases;

public class Persona {

    protected String nombre;
    protected String identificacion;
    protected String Celular;

    public Persona() {

    }

    public Persona(String nombre, String identificacion, String celular) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        Celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre +
                " \nidentificacion: " + identificacion +
                " \nCelular: " + Celular
                ;
    }
}

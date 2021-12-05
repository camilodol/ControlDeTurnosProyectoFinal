package Clases;

public class Paciente extends Persona {


    protected Integer turnoRecepcion;
    protected Object prioridad;

    public Paciente(Integer turnoRecepcion, Object prioridad) {
        this.turnoRecepcion = turnoRecepcion;
        this.prioridad = prioridad;
    }

    public Paciente(String nombre, String identificacion, String celular, Integer turnoRecepcion, Object prioridad) {
        super(nombre, identificacion, celular);
        this.turnoRecepcion = turnoRecepcion;
        this.prioridad = prioridad;
    }

    public Integer getTurnoRecepcion() {
        return turnoRecepcion;
    }

    public void setTurnoRecepcion(Integer turnoRecepcion) {
        this.turnoRecepcion = turnoRecepcion;
    }

    public Object getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Object prioridad) {
        this.prioridad = prioridad;
    }
}

package Modelo;

public class Conductor extends Objeto {

    private int id;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String domicilio;
    private String fNacimientos;
    private Bus buses;

    public Conductor() {
    }

    public Conductor(int id, String nombres, String apellidos, int telefono, String domicilio, String fNacimientos, Bus buses) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.fNacimientos = fNacimientos;
        this.buses = buses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getfNacimientos() {
        return fNacimientos;
    }

    public void setfNacimientos(String fNacimientos) {
        this.fNacimientos = fNacimientos;
    }

    public Bus getBuses() {
        return buses;
    }

    public void setBuses(Bus buses) {
        this.buses = buses;
    }

}

package Modelo;

public class Viaje extends Objeto {

    private int costo;
    private String origen;
    private String destino;
    private String horario;
    private String fecha;
    private Pasajero pasajeros;

    public Viaje() {
    }

    public Viaje(int costo, String origen, String destino, String horario, String fecha, Pasajero pasajeros) {
        this.costo = costo;
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pasajero getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero pasajeros) {
        this.pasajeros = pasajeros;
    }

}

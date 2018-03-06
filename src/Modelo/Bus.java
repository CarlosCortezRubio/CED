package Modelo;

import java.util.List;

public class Bus extends Objeto {

    private int id;
    private String placa;
    private int año;
    private String marca;
    private String modelo;
    private List<Asiento> asientos;
    private int Numasientos;
    

    public Bus() {
                this.id = 0;
        this.placa = "";
        this.año = 0;
        this.marca = "";
        this.modelo = "";
        this.Numasientos = 0;
    }

    public Bus(int id, String placa, int año, String marca, String modelo, int Numasientos) {
        this.id = id;
        this.placa = placa;
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
        this.Numasientos = Numasientos;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }


    public int getNumasientos() {
        return Numasientos;
    }

    public void setNumasientos(int Numasientos) {
        this.Numasientos = Numasientos;
    }

   
}

package Modelo;

public interface IObjeto {

    public static final int BUS = 1;
    public static final int CONDUCTOR = 2;
    public static final int PASAJERO = 3;
    public static final int TICKET = 4;
    public static final int VIAJE = 5;

    public abstract Objeto fabricaObjetos(int opcion);
}

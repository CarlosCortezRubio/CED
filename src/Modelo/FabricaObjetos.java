package Modelo;

public class FabricaObjetos implements IObjeto {

    @Override
    public Objeto fabricaObjetos(int opcion) {
        if (IObjeto.BUS == opcion) {
            return new Bus();
        } else if (IObjeto.CONDUCTOR == opcion) {
            return new Conductor();
        } else if (IObjeto.PASAJERO == opcion) {
            return new Pasajero();
        } else if (IObjeto.TICKET == opcion) {
            return new Ticket();
        } else if (IObjeto.VIAJE == opcion) {
            return new Viaje();
        }
        return null;
    }
}

package Modelo;

public class Asiento extends Objeto implements IClonarAsientos {

    @Override
    public IClonarAsientos clone() {
        Asiento asientoClone = null;
        try {
            asientoClone = (Asiento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return asientoClone;
    }
}

package Cliente;

import Controlador.ControladorBus;
import Vista.FrmBus;

public class Run {
    public static void main(String[] args) {
        FrmBus b=new FrmBus();
        ControladorBus c =new ControladorBus(b);
        
        b.conectaControlador(c);
    }
}

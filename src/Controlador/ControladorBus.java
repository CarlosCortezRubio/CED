package Controlador;
import Modelo.Bus;
import Tablas.TablaBus;
import Vista.FrmBus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class ControladorBus implements ActionListener,MouseListener{

    private FrmBus vista;
    private List<Bus> buses;
 int filaPulsada;

    public ControladorBus(FrmBus vista) {
        buses=new ArrayList<>();
        this.vista = vista;  
        cargarTabla();
    }
    private void cargarTabla(){
        //buses.add(new Bus());
        TablaBus mtb= new TablaBus(buses);
        
        this.vista.tabla.setModel(mtb);
            
    }
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion=e.getActionCommand();
        
        switch(opcion){
            case "INSERTAR":
                if(vista.txtAño.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Faltan parametros", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else{
                    if(vista.txtMarca.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Faltan parametros", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(vista.txtModelo.getText().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Faltan parametros", "ERROR", JOptionPane.WARNING_MESSAGE);
                        }else{
                            if(vista.txtNumAsientos.getText().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Faltan parametros", "ERROR", JOptionPane.WARNING_MESSAGE);
                            }else{
                                if(vista.txtPlaca.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "Faltan parametros", "ERROR", JOptionPane.WARNING_MESSAGE);
                                }else{
                                    if(isNumeric(vista.txtAño.getText())==false){
                                        JOptionPane.showMessageDialog(null, "El parametro numero de asientos tiene que ser entero", "ERROR", JOptionPane.WARNING_MESSAGE);
                                    }else{
                                        if(isNumeric(vista.txtNumAsientos.getText())==false){
                                            JOptionPane.showMessageDialog(null, "El parametro numero de asientos tiene que ser entero", "ERROR", JOptionPane.WARNING_MESSAGE);
                                        }else{
                                            System.out.println("insertando");
                                            Bus b =new Bus();
                                            b.setId(0);
                                            b.setAño(Integer.parseInt(vista.txtAño.getText()));
                                            b.setNumasientos(Integer.parseInt(vista.txtNumAsientos.getText()));
                                            b.setModelo(vista.txtModelo.getText());
                                            b.setPlaca(vista.txtPlaca.getText());
                                            b.setMarca(vista.txtPlaca.getText());
                                            buses.add(b);
                                            vista.tabla.updateUI();
                                        }
                                    }
                                }
                            } 
                        }
                    }
                }
                break;
            case "CANCELAR":
                System.out.println("Cerrando");   
                vista.dispose();
                break;
            
        }
    }
    
    
    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
  
    }

    @Override
    public void mouseReleased(MouseEvent e) {
   
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
    }

    @Override
    public void mouseExited(MouseEvent e) {
  
    }
    
}


package Tablas;

import Modelo.Bus;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablaBus extends AbstractTableModel{

    String[] columnas={"ID","PLACA","AÑO","MARCA","MODELO","ASIENTOS"};
    List<Bus> buses;

    public TablaBus(List<Bus> buses) {
        this.buses = buses;
    }
    
    @Override
    public int getRowCount() {
      return  buses.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
        
   }
    
    @Override
    public String getColumnName(int column) {
        return columnas[column];
        
   }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String columna="";
        Bus bus=(Bus) buses.get(rowIndex);
        switch (columnIndex){
            case 0: columna =String.valueOf(bus.getId());
             break;
            case 1: columna =bus.getPlaca();
             break;
            case 2: columna =String.valueOf(bus.getAño());
             break;
            case 3: columna =bus.getMarca();
             break;
            case 4: columna =bus.getModelo();
             break;
            case 5: columna =String.valueOf(bus.getNumasientos());
             break;
                
        }
        return columna;
    }
    public void eliminar(int rowIndex ){
        buses.remove(rowIndex);
    }
    
    public void actualizar(int rowIndex,Bus b){
        
        buses.remove(rowIndex);
        buses.add(rowIndex,b);
    }
    
}

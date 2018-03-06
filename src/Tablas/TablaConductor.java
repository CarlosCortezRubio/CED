
package Tablas;

import Modelo.Conductor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablaConductor extends AbstractTableModel{
    
    String[] columnas = {"ID", "NOMBRES Y APELLIDOS", "TELEFONO"};
    List<Conductor> personas;
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
    
}


package co.academia.Table;

import co.academia.Beans.Estudiante;
import co.academia.DAO.DAO_estudiante;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class Tb_estudiante extends AbstractTableModel{
    private String[] columns = {"DNI", "A. Paterno", "A. Materno", "Nombres", "Email", "Edad"};
    //DAO_estudiante daoE;
    List<Estudiante> lista;
    
    public Tb_estudiante(List<Estudiante> lista) throws SQLException {
       
        this.lista = lista;
        //System.out.println("lista - clase Tb_estudiante: "+ lista.size());
    }
    
    
    
    
    //Map<String, Estudiante> lista = new HashMap<>();

    @Override
    public int getRowCount() {
       return lista.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columns.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object valor = null;
        
        switch (columnIndex) {
            
            case 0:
                valor = lista.get(rowIndex).getDni();
                break;
            case 1:
                valor = lista.get(rowIndex).getApellido_paterno();
                break;
            case 2:
                valor = lista.get(rowIndex).getApellido_materno();
                break;
            case 3:
                valor = lista.get(rowIndex).getNombre();
                break;
            case 4:
                valor = lista.get(rowIndex).getCorreo_electronico();
                break;
            case 5:
                valor = lista.get(rowIndex).getEdad();
                break;
//            case 6:
//                valor = lista.get(rowIndex).getMensualidad();
//                break;
            default:
                //System.out.println("ENTRO EN ESTE METODO");
                break;
        }
        
        return valor; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public void AgregarEstudiante(Estudiante e) {
        lista.add(e);
        fireTableDataChanged();
    }
    
}

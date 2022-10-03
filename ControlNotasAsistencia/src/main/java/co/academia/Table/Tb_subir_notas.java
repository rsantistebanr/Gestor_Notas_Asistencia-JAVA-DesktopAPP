
package co.academia.Table;

import co.academia.Beans.Estudiante;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tb_subir_notas {
    
    
     private String[] columns = {"N°", "DNI", "Nombres","Ingresar notas"};
    //DAO_estudiante daoE;
    List<Estudiante> lista;
    JTable table;
    DefaultTableModel modelo;

    public Tb_subir_notas(List<Estudiante> lista) {
        this.lista = lista;
    }
    
    
    
    
    public DefaultTableModel mostrarRegistros() {
        boolean [] editable = {false, false,true};
        Class []types = new Class[]{java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class};
        
        DefaultTableModel modelo = new DefaultTableModel(columns,0){
            public Class getColumnClass(int i){
                return types[i];
            }
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        Object[] registros = new Object[4];

        int i = 0;
        for (Estudiante e : lista) {
            i++;
            registros[0] = String.valueOf(i);
            registros[1] = e.getDni();
            registros[2] = e.getApellido_paterno() + " " +e.getApellido_materno()+" "+e.getNombre();
            registros[3] = null;
            
            modelo.addRow(registros);
        }

        return modelo;

    }
    
}

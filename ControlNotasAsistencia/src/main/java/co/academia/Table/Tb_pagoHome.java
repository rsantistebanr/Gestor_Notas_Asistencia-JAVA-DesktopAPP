
package co.academia.Table;

import co.academia.Beans.Estudiante;
import co.academia.Beans.Pago;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tb_pagoHome {
  
      private String[] columns = {"N°", "DNI", "Nombres","Grupo","Seleccionar{x}"};
    //DAO_estudiante daoE;
    List<Estudiante> lista;
    JTable table;
    DefaultTableModel modelo;
    
    
    
    public Tb_pagoHome(List<Estudiante> lista) {
        this.lista = lista;
    }
    
//    public DefaultTableModel mostrarRegistros() {
//        boolean [] editable = {false, false,false,false,true};
//        Class []types = new Class[]{java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class};
//        
//        DefaultTableModel modelo = new DefaultTableModel(columns,0){
//            public Class getColumnClass(int i){
//                return types[i];
//            }
//            public boolean isCellEditable(int row, int column){
//                return editable[column];
//            }
//        };
//        
//        Object[] registros = new Object[4];
//
//        int i = 0;
//        for (Estudiante e : lista) {
//            i++;
//            registros[0] = String.valueOf(i);
//            registros[1] = e.getDni();
//            registros[2] = e.getApellido_paterno() + " " +e.getApellido_materno()+" "+e.getNombre();
//            registros[3] = e.getFecha_matricula();
//            registros[4] = 
//            
//            modelo.addRow(registros);
//        }
//
//        return modelo;
//
//    }




    public DefaultTableModel mostrarRegistros(boolean  sel) {
        boolean [] editable = {false, false,false,false,true};
        Class []types = new Class[]{java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class};
        
        DefaultTableModel modelo = new DefaultTableModel(columns,0){
            public Class getColumnClass(int i){
                return types[i];
            }
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        Object[] registros = new Object[5];
//        modelo = new DefaultTableModel(null, columns);
//        String[] registros = new String[5];
        int i = 0;
        for (Estudiante e : lista) {
            i++;
            registros[0] = String.valueOf(i);
            registros[1] = e.getDni();
            registros[2] = e.getApellido_paterno() + " " +e.getApellido_materno()+" "+e.getNombre();
            registros[3] = e.getId_grupo();
            registros[4] = sel;
            
            modelo.addRow(registros);
        }

        return modelo;

    }
   
   

   public boolean deleteRegistro(){
       
       return false;
   }
    
}

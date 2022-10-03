/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Table;

import co.academia.Beans.Estudiante;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class Tb_asistencia {

    private String[] columns = {"N°", "DNI", "A. Paterno", "A. Materno", "Nombres","(X)"};
    //DAO_estudiante daoE;
    List<Estudiante> lista;
    JCheckBox checkBox;
    JTable table;
    DefaultTableModel modelo;

    public Tb_asistencia(List<Estudiante> lista) throws SQLException {

        this.lista = lista;

        
    }



    public DefaultTableModel mostrarRegistros(boolean  sel) {
        boolean [] editable = {false, false,false,false,true};
        Class []types = new Class[]{java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class};
        
        DefaultTableModel modelo = new DefaultTableModel(columns,0){
            public Class getColumnClass(int i){
                return types[i];
            }
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        Object[] registros = new Object[6];
//        modelo = new DefaultTableModel(null, columns);
//        String[] registros = new String[5];
        int i = 0;
        for (Estudiante e : lista) {
            i++;
            registros[0] = String.valueOf(i);
            registros[1] = e.getDni();
            registros[2] = e.getApellido_paterno();
            registros[3] = e.getApellido_materno();
            registros[4] = e.getNombre();
            registros[5] = sel;
            
            modelo.addRow(registros);
        }

        return modelo;

    }
   
   

   public boolean deleteRegistro(){
       
       return false;
   }

//    @Override
//    public String getColumnName(int column) {
//        return columns[column];
//    }
//
//    public void AgregarEstudiante(Estudiante e) {
//        lista.add(e);
//        fireTableDataChanged();
//    }

}

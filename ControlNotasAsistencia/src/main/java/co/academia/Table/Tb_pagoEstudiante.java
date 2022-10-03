/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.Table;

import co.academia.Beans.Estudiante;
import co.academia.Beans.Pago;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class Tb_pagoEstudiante extends AbstractTableModel{

    List<Pago> lista;

    private String[] columns = {"N°", "Fecha Pago", "Monto","Deuda","Estado","Seleccionar{x}"};
    //DAO_estudiante daoE;
    JTable table;
    DefaultTableModel modelo;
    
    public Tb_pagoEstudiante(List<Pago> lista) {
        this.lista = lista;
    }

    public DefaultTableModel mostrarRegistros(boolean sel) {
        boolean[] editable = {false, false, false, false, false,true};
        Class[] types = new Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class, java.lang.Boolean.class};

        DefaultTableModel modelo = new DefaultTableModel(columns, 0) {
            public Class getColumnClass(int i) {
                return types[i];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        Object[] registros = new Object[6];

        int i = 0;
        for (Pago e : lista) {
            i++;
            registros[0] = String.valueOf(i);
            registros[1] = e.getDate_pago();
            registros[2] = e.getMonto();
            registros[3] = e.getDeuda();
            
            if(e.getEstado() == 1){
                registros[4] = "Pendiente";
            }else{
                registros[4] = "Cancelado";
            }
            
            registros[5] = sel;

            modelo.addRow(registros);
        }

        return modelo;

    }
    
    public void AgregarEstudiante(Pago p) {
        lista.add(p);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

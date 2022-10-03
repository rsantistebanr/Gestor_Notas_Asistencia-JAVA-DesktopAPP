
package co.academia.Table;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;


public class RenderElements extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object o,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(o instanceof JCheckBox){
            //crea y agrega el JCheckBox
            JCheckBox check = new JCheckBox();
            return check;
        }else if(o instanceof JButton){
            JButton boton = (JButton)o;
            return boton;
        
        }
        return super.getTableCellRendererComponent(table, o, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public void addChechBox(int column, JTable table){
//        TableColumn tc  = table.getColumnModel().getColumn(column);
//        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
//        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
//    }
}

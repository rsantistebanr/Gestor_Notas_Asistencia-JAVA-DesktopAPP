package co.academia.DAO;

import co.academia.Beans.Pago;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAO_pago {

    Connection conn = null;
    conexion conx;
    ResultSet rst;
    PreparedStatement pst;

    Pago pago;

    public DAO_pago() {

        try {

            this.conx = new conexion();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al hacer conexion con la base de datos. Por favor "
                    + "intente nuevamente "
                    + "y si el problema persiste comuniquese con Mantenimiento - cel 995515461.");
            //Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public List<Pago> PAGO_SELECT(int dni, int curso) {
        String sql = "call pago_select(?,?)";
        List<Pago> lista = new ArrayList<>();
        try {

            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, dni);
            pst.setInt(2, curso);

            rst = pst.executeQuery();
            while (rst.next()) {

                pago = new Pago();
                pago.setDate_pago(rst.getDate(2));
                pago.setDni(rst.getString(3));
                pago.setId_curso(rst.getInt(4));
                pago.setMonto(rst.getFloat(5));
                pago.setCant_meses(rst.getInt(6));
                pago.setDeuda(rst.getFloat(7));
                pago.setEstado(rst.getInt(8));
                lista.add(pago);

            }
            conn.close();
            pst.close();
            rst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public List<Pago> PAGO_SELECT_DNI(String dni) {
        String sql = "call pago_selectDNI(?)";
        List<Pago> lista = new ArrayList<>();
        try {

            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, dni);

            rst = pst.executeQuery();
            while (rst.next()) {

                pago = new Pago();
                pago.setDate_pago(rst.getDate(2));
                pago.setDni(rst.getString(3));
                pago.setId_curso(rst.getInt(4));
                pago.setMonto(rst.getFloat(5));
                pago.setCant_meses(rst.getInt(6));
                pago.setDeuda(rst.getFloat(7));
                pago.setEstado(rst.getInt(8));
                lista.add(pago);

            }
            conn.close();
            pst.close();
            rst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void PAGO_INSERT(Pago pago) {
        String sql = "call pago_insert(?,?,?,?,?,?,?)";

        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setDate(1, pago.getDate_pago());
            pst.setString(2, pago.getDni());
            pst.setInt(3, pago.getId_curso());
            pst.setFloat(4, pago.getMonto());
            pst.setInt(5, pago.getCant_meses());
            pst.setFloat(6, pago.getDeuda());
            pst.setInt(7, pago.getEstado());
            
            pst.executeUpdate();
            
            conn.close();
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }

}

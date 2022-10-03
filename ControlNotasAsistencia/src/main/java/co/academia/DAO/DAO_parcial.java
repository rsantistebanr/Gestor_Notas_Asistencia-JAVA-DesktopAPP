package co.academia.DAO;

import co.academia.Beans.Parcial;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO_parcial {
    
    Connection conn = null;
    conexion conx;
    ResultSet rst;
    PreparedStatement pst;

    Parcial parcial;

    public DAO_parcial() {
        try {
            this.conx = new conexion();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_parcial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Parcial> READ_PARCIAL(int parc) {
        String sql = "call academia.parcial_select_parcial(?)";
        List<Parcial> lista = new ArrayList<>();
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, parc);
            
            rst = pst.executeQuery();

            while (rst.next()) {
                parcial = new Parcial();
                
                parcial.setId_parcial(rst.getInt(1));
                parcial.setFecha(rst.getDate(2));
                parcial.setNombre(rst.getString(3));
                parcial.setTotal(rst.getFloat(4));
                parcial.setEstado(rst.getInt(5));
                lista.add(parcial);
            }

            conn.close();
            pst.close();
            rst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_parcial.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void INSERT_PARCIAL(Parcial parcial) {
        try {

            String sql = "call academia.parcial_insert(?,?,?,?,?);";

            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setInt(1, parcial.getId_parcial());
            pst.setDate(2, parcial.getFecha());
            pst.setString(3, parcial.getNombre());
            pst.setFloat(4, parcial.getTotal());
            pst.setInt(5, parcial.getEstado());
            pst.executeUpdate();

            conn.close();
            pst.close();

        } catch (SQLException ex) {

            Logger.getLogger(DAO_parcial.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}

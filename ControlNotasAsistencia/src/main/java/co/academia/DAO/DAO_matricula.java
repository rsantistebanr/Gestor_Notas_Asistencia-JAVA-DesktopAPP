/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.DAO;

import co.academia.Beans.Matricula;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBERT
 */
public class DAO_matricula {

    private conexion conx = null;
    private Connection conn;
    private ResultSet rst;
    private PreparedStatement pst;

    Matricula matricula;

    public DAO_matricula() throws SQLException {
        try {
            conx = new conexion();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_matricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ESTUDIANTE_INSERT(Matricula matricula) throws SQLException {
        String sql = "call academia.matricula_i(?,?,?,?,?,?,?,?,?);";
        conn = conx.getConnection();
        pst = conn.prepareStatement(sql);
        pst.setString(1, matricula.getDNI());
        pst.setDate(2, matricula.getFecha_matricula());
        pst.setFloat(3, matricula.getMensualidad());
        pst.setFloat(4, matricula.getMensualidad());
        pst.setInt(5, matricula.getEstado());
        pst.executeUpdate();

        conn.close();
        pst.close();

    }

    public void ESTUDIANTE_UPDATE(Matricula matricula) throws SQLException {
        String sql = "call matricula_u(?,?,?,?,?,?,?,?,?);";

        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setString(1, matricula.getDNI());
            pst.setDate(2, matricula.getFecha_matricula());
            pst.setFloat(3, matricula.getMensualidad());
            pst.setFloat(4, matricula.getMensualidad());
            pst.setInt(5, matricula.getEstado());
            pst.executeUpdate();

            conn.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_matricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ESTUDIANTE_DELETE_LOGICO(String id) throws SQLException {
        String sql = "call matricula_d(?);";

        conn = conx.getConnection();
        pst = conn.prepareStatement(sql);

        pst.setString(1, id);

        pst.executeUpdate();
        conn.close();
        pst.close();
    }

    public Matricula MATRICULA_SELECT_ID(String id) throws SQLException {
        String sentencia = "call academia.matricula_select_id(?)";
        
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sentencia);
            pst.setString(1, id);
            rst = pst.executeQuery();
            Matricula matricula = new Matricula();
            while (rst.next()) {
                
                matricula = new Matricula();
                matricula.setIdmatricula(rst.getInt(1));
                matricula.setDNI(rst.getString(2));
                matricula.setFecha_matricula(rst.getDate(3));
                JOptionPane.showMessageDialog(null, "Fecha in:2s "+matricula.getFecha_matricula());
                matricula.setMensualidad(rst.getFloat(4));
                matricula.setEstado(rst.getInt(5));

            }
            pst.close();
            rst.close();
            conn.close();
            return matricula;
        } catch (SQLException e) {
            throw e;
        }
    }

}

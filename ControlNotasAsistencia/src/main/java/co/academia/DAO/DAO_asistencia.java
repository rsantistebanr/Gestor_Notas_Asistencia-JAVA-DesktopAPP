/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.DAO;

import co.academia.Beans.Asistencia;
import co.academia.Beans.Estudiante;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_asistencia {

    private Connection conn;
    private conexion conx;
    private ResultSet rst;
    private PreparedStatement pst;

    private Asistencia asistencia;

    public DAO_asistencia() {
        try {
            conx = new conexion();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Asistencia> Asistencia_Select_All() {

        try {
            String sql = "";
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            List<Asistencia> lista = new ArrayList<>();

            while (rst.next()) {
                asistencia = new Asistencia();
                asistencia.setId_estudiante(rst.getString(1));
                asistencia.setFecha(rst.getDate(2));
                asistencia.setId_categoria_asistencia(rst.getInt(3));
                lista.add(asistencia);
            }
            conn.close();
            pst.close();
            rst.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void Asistencia_Insert(Asistencia a) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String formattedDate = simpleDateFormat.format(a.getFecha());

        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
        
        String sql = "call asistencia_insert(?,?,?);";
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setString(1, a.getId_estudiante());
            pst.setDate(2, date1);
            pst.setInt(3, a.getId_categoria_asistencia());
            pst.executeUpdate();

            pst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Asistencia_Update(Asistencia a) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String formattedDate = simpleDateFormat.format(a.getFecha());

        java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);

        String sql = "call asistencia_update(?,?,?);";
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setString(1, a.getId_estudiante());
            pst.setDate(2, date1);
            pst.setInt(3, a.getId_categoria_asistencia());
            pst.executeUpdate();

            pst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

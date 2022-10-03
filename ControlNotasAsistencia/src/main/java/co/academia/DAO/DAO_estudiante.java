/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.academia.DAO;

import co.academia.Beans.Estudiante;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO_estudiante {

    private conexion conx = null;
    private Connection conn;
    private ResultSet rst;
    private PreparedStatement pst;

    private Estudiante estudiante;

    public DAO_estudiante() throws SQLException {
        try{
        conx = new conexion();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //meothod for read estudiante register
    //metodo para leer habitaciones registradA
    public List read_estudiante() throws SQLException {

        String sentencia = "call academia.estudiante_s_all();";
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sentencia);
            rst = pst.executeQuery();
            //codigo = DNI
            List<Estudiante> list_estudiante = new ArrayList<>();
            while (rst.next()) {
                 estudiante = new Estudiante();
                estudiante.setDni(rst.getString(1));
                estudiante.setNombre(rst.getString(2));
                estudiante.setApellido_paterno(rst.getString(3));
                estudiante.setApellido_materno(rst.getString(4));
                estudiante.setEdad(rst.getInt(5) );
                estudiante.setCorreo_electronico(rst.getString(6));
                estudiante.setId_grupo(7);
                estudiante.setEstado(rst.getInt(8));
                
                list_estudiante.add(estudiante);
            }

            pst.close();
            rst.close();
            conn.close();
            return list_estudiante;
        } catch (SQLException e) {
            throw e;
        }

    }

    public void ESTUDIANTE_INSERT(Estudiante estudiante) throws SQLException {
        String sql = "call academia.estudiante_i(?,?,?,?,?,?,?,?,?);";
        

        conn = conx.getConnection();
        pst = conn.prepareStatement(sql);

        pst.setString(1, estudiante.getDni());
        pst.setString(2, estudiante.getNombre());
        pst.setString(3, estudiante.getApellido_paterno());
        pst.setString(4, estudiante.getApellido_materno());
        pst.setInt(5, estudiante.getEdad());
        pst.setString(6, estudiante.getCorreo_electronico());
        pst.setInt(7, 1);
        //registro del dia de matricula
        pst.setInt(8, estudiante.getEstado());
        
        pst.executeUpdate();

        conn.close();
        pst.close();

    }

    public void ESTUDIANTE_UPDATE(Estudiante estudiante) throws SQLException {
        String sql = "call estudiante_u(?,?,?,?,?,?,?,?,?);";

        try{
        conn = conx.getConnection();
        pst = conn.prepareStatement(sql);

       pst.setString(1, estudiante.getDni());
        pst.setString(2, estudiante.getNombre());
        pst.setString(3, estudiante.getApellido_paterno());
        pst.setString(4, estudiante.getApellido_materno());
        pst.setInt(5, estudiante.getEdad());
        pst.setString(6, estudiante.getCorreo_electronico());
        pst.setInt(7, 1);
        //registro del dia de matricula
        pst.setInt(8, estudiante.getEstado());
        pst.executeUpdate();

        conn.close();
        pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void ESTUDIANTE_DELETE_LOGICO(String id) throws SQLException {
        String sql = "call estudiante_d(?);";

        conn = conx.getConnection();
        pst = conn.prepareStatement(sql);

        pst.setString(1, id);

        pst.executeUpdate();
        conn.close();
        pst.close();
    }

    public Estudiante ESTUDIANTE_SELECT_ID(String id) throws SQLException {
        String sentencia = "call academia.estudiante_select_id(?);";
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sentencia);
            pst.setString(1, id);
            rst = pst.executeQuery();
            Estudiante estudiante = new Estudiante();
            while (rst.next()) {
                estudiante = new Estudiante();
                estudiante.setDni(rst.getString(1));
                estudiante.setNombre(rst.getString(2));
                estudiante.setApellido_paterno(rst.getString(3));
                estudiante.setApellido_materno(rst.getString(4));
                estudiante.setEdad(rst.getInt(5) );
                estudiante.setCorreo_electronico(rst.getString(6));
                estudiante.setId_grupo(7);
                estudiante.setEstado(rst.getInt(8));

            }
            pst.close();
            rst.close();
            conn.close();
            return estudiante;
        } catch (SQLException e) {
            throw e;
        }
    }

}

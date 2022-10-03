package co.academia.DAO;

import co.academia.Beans.Notas;
import co.academia.Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_notas {

    Connection conn = null;
    conexion conx;
    ResultSet rst;
    PreparedStatement pst;

    Notas notas;

    public DAO_notas() {
        try {
            this.conx = new conexion();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Notas> READ_NOTAS_IDPARCIAL(int parcial, int curso) {
        String sql = "call academia.notas_select_parcial(?,?)";
        List<Notas> lista = new ArrayList<>();
        try {
            conn = conx.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, parcial);
            pst.setInt(2, curso);

            rst = pst.executeQuery();

            while (rst.next()) {
                notas = new Notas();
                notas.setId_parcial(rst.getInt(1));
                notas.setDni(rst.getString(2));
                notas.setId_curso(rst.getInt(3));
                notas.setPuntaje(rst.getFloat(4));
                notas.setNum_preguntasM(rst.getInt(5));
                notas.setNum_preguntasB(rst.getInt(6));
                lista.add(notas);
            }

            conn.close();
            pst.close();
            rst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void INSERT_NOTAS_PARCIAL(List<Notas> list) {
        List<Notas> lista = list;
        int t = lista.size();
        int i = 0;
        try {

            while (i < t) {
                String sql = "call academia.notas_parcial_insert(?,?,?,?,?,?);";

                conn = conx.getConnection();
                pst = conn.prepareStatement(sql);

                pst.setInt(1, list.get(i).getId_parcial());
                pst.setString(2, list.get(i).getDni());
                pst.setInt(3, list.get(i).getId_curso());
                pst.setFloat(4, list.get(i).getPuntaje());
                pst.setInt(5, list.get(i).getNum_preguntasM());
                pst.setInt(6, list.get(i).getNum_preguntasB());
                pst.executeUpdate();
                i++;
                
            }

            conn.close();
            pst.close();

        } catch (SQLException ex) {

            Logger.getLogger(DAO_notas.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}

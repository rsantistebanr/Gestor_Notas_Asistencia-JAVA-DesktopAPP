
import co.academia.Beans.Asistencia;
import co.academia.DAO.DAO_asistencia;
import co.academia.DAO.DAO_estudiante;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROBERT
 */
public class T_estudiante {
    public static void main(String[] args) throws SQLException {
//        DAO_estudiante DE = new DAO_estudiante();
//        System.out.println((DE.ESTUDIANTE_SELECT_ID("76194183")).getNombre());
        
        DAO_asistencia daoA = new DAO_asistencia();
        LocalDate todaysDate = LocalDate.now();
        
        System.out.println("2. "+Date.valueOf(todaysDate));
        //txt_fecha.setText(String.valueOf(todaysDate));
        daoA.Asistencia_Insert(new Asistencia("458",Date.valueOf(todaysDate),1));
        DAO_asistencia daoA2 = new DAO_asistencia();
        
        daoA2.Asistencia_Insert(new Asistencia("459",Date.valueOf(todaysDate),1));
        
        DAO_asistencia daoA3 = new DAO_asistencia();
        daoA3.Asistencia_Insert(new Asistencia("460",Date.valueOf(todaysDate),1));
        
        System.out.println("Proceso terminado [ok]");
        
        
    }
}

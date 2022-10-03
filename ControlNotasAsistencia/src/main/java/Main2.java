
import co.academia.Views.home;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROBERT
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "No se pudo inicializar el fomulario Asitencia", "ERROR", JOptionPane.ERROR_MESSAGE);

        LOAD splash = new LOAD();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            splash.load_principal.setValue(i);
        }

//        home v_home = new home();
//        v_home.setLocationRelativeTo(null);
//        splash.dispose();
//        v_home.setVisible(true);
        home home = new home();
        splash.dispose();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

}

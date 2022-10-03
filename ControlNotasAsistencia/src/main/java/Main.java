
import co.academia.Views.home;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROBERT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LOAD splash = new LOAD();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);
        
        for(int i= 0; i<100;i++){
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

        Menu menu = new Menu();
        splash.dispose();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        
    }
    
}

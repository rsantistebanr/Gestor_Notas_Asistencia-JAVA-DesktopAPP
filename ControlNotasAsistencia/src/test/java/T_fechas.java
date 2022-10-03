
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROBERT
 */
public class T_fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //fecha de matricula 29/07/2022
        LocalDate fechahoy = LocalDate.now();
        //formas de crear una lacata date

        //1. LocalDate date3 = LocalDate.parse("2018-10-30");
        //2. 
//        LocalDate fechaM = LocalDate.parse("2022-07-10");
//        int diaM = fechaM.getDayOfMonth();
//        int anioM = fechaM.getYear();
//        int mesM = fechaM.getMonthValue();
//        System.out.println("FECHA DE MATRICULA: " + fechaM);
        //sumamos fechas de tipo LocalTime
        System.out.println("Fecha actual: " + fechahoy);
        //System.out.println("Dia de hoy: " + fechahoy.getDayOfMonth());
        //System.out.println("Mes de hoy: " + fechahoy.getMonth());
        //System.out.println("Mes de hoy: " + fechahoy.getMonthValue());
        //fechahoy.getYear();

        //compar la fecha de la matricula y la fecha del mes actual:;
        final int JANUARY = 1;
        final int FEBRuaRY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPETEMBER = 9;
        final int OCTUBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        String pagosPendoiente[] = {"2022-05-10", "2022-07-30", "2022-08-10", "2022-01-10", "2022-05-10"};

        int cantidadPendiente = 0;
        int cantidadPagosRestrasados = 0;
        int cantidadPagosHoy = 0;
        

        for (int i= 0; i<pagosPendoiente.length;i++) {

            LocalDate fechaM = LocalDate.parse(pagosPendoiente[i]);
            int diaM = fechaM.getDayOfMonth();
            int anioM = fechaM.getYear();
            int mesM = fechaM.getMonthValue();
            System.out.println("FECHA DE MATRICULA NRO "+i+": " + fechaM);

            if (fechahoy.getYear() == anioM && fechahoy.getMonthValue() != mesM) {

                //significa que ya paso ese mes donde matriculo pero es el mismo año
                if (diaM < fechahoy.getDayOfMonth()) {
                    System.out.println("El pago esta retrasado: " + (diaM - fechahoy.getDayOfMonth()) + " dias.");
                } else if (diaM == fechahoy.getDayOfMonth()) {
                    System.out.println("Hoy es fecha de pago");
                } else if (diaM > fechahoy.getDayOfMonth()) {
                    System.out.println("Fecha de pago vence en: " + (diaM - fechahoy.getDayOfMonth()) + " dias.");
                }

            } else if (fechahoy.getYear() > anioM) {
                
                if (diaM < fechahoy.getDayOfMonth()) {
                    
                    System.out.println("El pago esta retrasado: " + (diaM - fechahoy.getDayOfMonth()) + " dias.");
                    
                } else if (diaM == fechahoy.getDayOfMonth()) {
                    
                    System.out.println("Hoy es fecha de pago");
                    
                } else if (diaM > fechahoy.getDayOfMonth()) {
                    
                    if((diaM - fechahoy.getDayOfMonth()) ==1 ){
                        System.out.println("Fecha de pago vence en 1 dias.[SE EVIA MENSAJE AL WSP");
                    }else{
                        System.out.println("Fecha de pago vence en: " + (diaM - fechahoy.getDayOfMonth()) + " dias.[nO ENVIAR MENSAJE]");
                    }
                    
                }
                
            }
            
            System.out.println("=====================================");
            System.out.println("");
            System.out.println("");
            
            if( diaM == 28 ){
                
            }
        }
//        System.out.println("Fecha suma: " + fechahoy.plusMonths(2));
//        System.out.println("Fecha menos: " + fechahoy.minusMonths(3));

        System.out.println("Fecha actual: " + fechahoy);
        int meses = 0;
        for(int j=0; j<12;j++){
            meses += 1;
            System.out.println("Mensualidad: " + fechahoy.plusMonths(meses));
        }


    }

}

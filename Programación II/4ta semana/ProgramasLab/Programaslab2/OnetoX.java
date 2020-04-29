package Programaslab2;

import java.time.LocalDate;
import java.time.LocalTime;

public class OnetoX{
    public static void main(String[] args) throws Exception {
        int num = 0;
        int cont = 0;

        Thread hook = new Thread(new Runnable(){
            public void run(){
                LocalDate fecha = LocalDate.now();
                LocalTime hora = LocalTime.now();
                System.err.println("ERROR: programa interrumpido en la Fecha: "+fecha+", Hora: "+hora); 
            }
        });

        Runtime.getRuntime().addShutdownHook(hook);


        
        try{
            num = Integer.parseInt(args[0]);
            if(num <= 0){
                System.err.println("ERROR: Número inválido. El número debe ser mayor a 0");   
            }
            else{
                for(cont = 1; cont <= num;cont++){
                    System.out.println(cont);
                    Thread.sleep(1000);
                }
            }
            Runtime.getRuntime().removeShutdownHook(hook);
        }
        catch(NumberFormatException ex){
            System.err.println("ERROR: conversión fallida. Revise el número introducido y vuelva a intentarlo");
            Runtime.getRuntime().removeShutdownHook(hook);
        }
        
        
    }
}
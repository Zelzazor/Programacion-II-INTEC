package Programaslab1;

import java.util.Scanner;

public class Suma{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String numinString = "";
        int num = 0;
        int suma = 0;
            while(lector.hasNextLine()){
                numinString = lector.nextLine();
                if(numinString.equals(""))
                    break;
                    try{
                        num = Integer.parseInt(numinString);
                        suma+=num;
                    }
                    catch(NumberFormatException ex){
                        System.err.println("ERROR: conversión fallida. Revise el número introducido y vuelva a intentarlo");
                    }
            }
            System.out.println(suma);
        lector.close();
    }
}
package Programaslab1;

import java.util.Scanner;

public class Par{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String numinString = "";
        int num = 0;
        while(lector.hasNextLine()){
            numinString = lector.nextLine();
            if(numinString.equals(""))
                break;
            try{
                num = Integer.parseInt(numinString);
                if(num % 2 == 0){
                    System.out.println(num);
                }
            }
            catch(NumberFormatException ex){
                System.err.println("ERROR: conversión fallida. Revise el número introducido y vuelva a intentarlo");
            }
        }
        lector.close(); 
    }
}

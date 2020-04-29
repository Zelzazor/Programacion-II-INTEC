package Programaslab1;

public class OnetoX{
    public static void main(String[] args) {
        int num = 0;
        try{
            num = Integer.parseInt(args[0]);
            if(num <= 0){
                System.err.println("ERROR: Número inválido. El número debe ser mayor a 0");   
            }
            else{
                for(int i = 1; i <= num;i++){
                    System.out.println(i);
                }
            }
        }
        catch(NumberFormatException ex){
            System.err.println("ERROR: conversión fallida. Revise el número introducido y vuelva a intentarlo");
        }
        
        
    }
}
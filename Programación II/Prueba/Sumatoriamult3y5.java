import java.util.Scanner;


public class Sumatoriamult3y5{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite un número entero positivo: ");

        try{
            int n = lector.nextInt();
            int result = 0;
            for(int i = 1; i<=n;i++){
                if(i % 3 == 0 || i % 5 == 0){
                    result+=i;
                }
            }
            System.out.println("La sumatoria es: "+result);
        }
        catch (Exception ex){
            System.out.println("ERROR: Conversión fallida, revise su número y vuelva a intentarlo.");
        }

        lector.close();
    }
}
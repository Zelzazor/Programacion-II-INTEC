import java.util.Scanner;


public class SumatoriaoMultiplicacion{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        

        System.out.println("Escriba S si quiere la sumatoria de los números o M si quiere la multiplicación de los números: ");

        String select = lector.nextLine();

        select = select.toLowerCase();

        if(select.equals("s")){

            System.out.println("Digite un número entero positivo: ");
            try{
                
                int n = lector.nextInt();
                int result = 0;
                for(int i = 1; i<=n;i++){
                        result+=i;
                }
                System.out.println("La sumatoria es: "+result);
            }
            catch (Exception ex){
                System.out.println("ERROR: Conversión fallida, revise su número y vuelva a intentarlo.");
            }
        }
        else if(select.equals("m")){

            System.out.println("Digite un número entero positivo: ");
            
            try{
                int n = lector.nextInt();
                int result = 1;
                for(int i = 1; i<=n;i++){
                        result*=i;
                }
                System.out.println("La multiplicación es: "+result);
            }
                catch (Exception ex){
                    System.out.println("ERROR: Conversión fallida, revise su número y vuelva a intentarlo.");
                }
            
        }

        

        lector.close();
    }
}
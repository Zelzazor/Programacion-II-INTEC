import java.util.Scanner;

public class AditivePersistency {

    public static int getAditivePersistency(int number){
        int contpers = 0;
        while(number > 9){
            double num2 = number;
            int cont = 1;
            while(num2 > 9){
                num2=number/Math.pow(10,cont);
                cont++;
            }
            int num3 = number;
            int num4 = 0;
            int result = 0;
                for(int i = 0; i < cont; i++){
                    num4 = num3 % 10;
                    num3/=10;
                    result+=num4;
                }
            number = result;
            contpers++;
        }
        return contpers;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        while(lector.hasNext()){
        int num = lector.nextInt();
        System.out.println(num + ": "+getAditivePersistency(num));
        }


        lector.close();
    }
}
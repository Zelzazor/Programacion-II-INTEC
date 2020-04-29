//import java.util.Scanner;

public class Bitwise{
    public static void main(String[] args) {
        short num = Short.parseShort(args[0]);
        //Scanner lector = new Scanner(System.in);
        //short num = lector.nextShort();
        //Operaciones de bits: &, |, ^, << >>, <<<, >>>
        //1000000000000000
        //1101010101010101 &
        //1000000000000000 >> 15
        //0000000000000001 == 1(10)
        // if ((a & b) >> 15) == 1 -> 
        short[] conditions = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, -32768};
        short length = (short) (conditions.length);
        System.out.println("");
        for(short i = 0; i < length; i++){

            switch(conditions[i]){
                case 1: System.out.print("Alcoholism: "); break;
                case 2: System.out.print("Anorexia: "); break;
                case 4: System.out.print("Antisocial: "); break;
                case 8: System.out.print("Anxiety: "); break;
                case 16: System.out.print("Bipolar: "); break;
                case 32: System.out.print("Bulimia: "); break;
                case 64: System.out.print("Dependent: "); break;
                case 128: System.out.print("Depression: "); break;
                case 256: System.out.print("Kleptomaniac: "); break;
                case 512: System.out.print("Nicotine addiction: "); break;
                case 1024: System.out.print("Obssesive-Compulsive: "); break;
                case 2048: System.out.print("Panic: "); break;
                case 4096: System.out.print("Paranoid: "); break;
                case 8192: System.out.print("Post-traumatic stress: "); break;
                case 16384: System.out.print("Programmer: "); break;
                case -32768: System.out.print("Tester: "); break;
                
            }
            switch(num & conditions[i]){
                case 1: 
                case 2: 
                case 4: 
                case 8: 
                case 16: 
                case 32: 
                case 64: 
                case 128:
                case 256: 
                case 512: 
                case 1024: 
                case 2048: 
                case 4096: 
                case 8192: 
                case 16384: 
                case -32768: System.out.print("Yes\n"); break;
                default: System.out.print("No\n");
                
            }
        }

        //lector.close();
    }
}
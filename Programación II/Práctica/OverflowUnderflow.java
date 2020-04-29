public class OverflowUnderflow{
    public static void main(String[] args) {
        long overflow = 2147483647;
        System.out.println("Ejemplo de overflow: " + (overflow + 1) );
        long underflow = -2147483648;
        System.out.println("Ejemplo de underflow: "+ (underflow - 1) );
    }
}
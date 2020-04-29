import java.util.Scanner;

public class HolaNombre{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Diga su nombre: ");
        System.out.println("Hola, "+ lector.nextLine());
        lector.close();
    }
}
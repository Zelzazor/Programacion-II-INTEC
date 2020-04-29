import java.util.Scanner;

public class HolaExclusivo{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Diga su nombre: ");
        String nombre = lector.nextLine();
        if(nombre.equals("El penco") || nombre.equals("Ranfis")){
            System.out.println("Hola, "+nombre);
        }
        else{
            System.out.println("A usted no lo saludo.");
        }
            
        lector.close();
    }
}
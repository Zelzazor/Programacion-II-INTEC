public class RandomNums {
    public static void main(String[] args) {
        int cant = Integer.parseInt(args[0]);
        for(int i = 0; i < cant; i++){
            System.out.println(Math.round(Math.random()*1000000));
        }
    }
}
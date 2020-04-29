public class PalabrasEnmarcadas{
    public static void main(String[] args) {
        int largo = args.length;
        int max = 0;
        for(int i = 0; i < largo; i++){
            if(max < args[i].length()){
                max = args[i].length();
            }
        }
        for(int i= 0;i<max+2;i++){
            System.out.print("*");
            if(i == max+1){
                System.out.print("\n");
            }
        }

        for(int i = 0; i<largo;i++){
            if(max==args[i].length()){
                System.out.println("*"+args[i]+"*");
            }
            else{
                int diferencia = max - args[i].length();
                System.out.print("*"+args[i]);
                for(int j = 0; j < diferencia; j++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
            
        }

        for(int i= 0;i<max+2;i++){
            System.out.print("*");
        }

    }
}
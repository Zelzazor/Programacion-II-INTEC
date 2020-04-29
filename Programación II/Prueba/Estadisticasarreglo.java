 public class Estadisticasarreglo{
    public static void main(String[] args) {
        int min, max, moda = 0, rango = 0;
        double promedio = 0;
        int largo = args.length;
        int nums[] = new int[largo];
        for(int i = 0; i < largo; i++){
            nums[i] = Integer.parseInt(args[i]); 
        }
        min = nums[0];
        max = nums[0];
        for(int i = 0;i<largo;i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
            promedio+=nums[i];
        }


        int frecuModa = 0;

        for (int  i = 0; i < largo; i++ ) {
            int frecuTemp = 0; 
            for (int j = 0; j < largo; j++) {
              if (nums [i] == nums [j])
                frecuTemp++;
            }
            if (frecuTemp > frecuModa) {
              moda = nums[i];
              frecuModa = frecuTemp;
            }
          }
        
        rango = max - min;

        promedio/=largo;

        System.out.println("El numero mayor es: "+max);
        System.out.println("El numero menor es: "+min);
        System.out.println("El promedio es: "+promedio);
        System.out.println("La moda es: "+ moda);
        System.out.println("El rango es: "+rango);
    }
}
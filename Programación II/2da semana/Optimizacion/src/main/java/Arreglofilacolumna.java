public class Arreglofilacolumna {
    public static void main(String[] args) {
        int [][] table =  new int [10000][10000];
        long seg_inicial = System.currentTimeMillis();
        int cont = 0;
        for (int i = 0; i<10000-1; i++){
            for(int j = 0; j<10000-1; j++){
                cont++;
                table[i][j] = 100;
                if(cont % 10 == 0)
                    System.out.println(table[i][j]);
            }
        }
        long seg_final = System.currentTimeMillis();
        long dif = seg_final - seg_inicial;
        System.out.println("El programa tardó "+ dif + " milisegundo(s) en ejecutarse");
    }
}

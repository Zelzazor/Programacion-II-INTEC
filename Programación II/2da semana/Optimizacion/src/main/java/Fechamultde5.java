class Fechamultde5 {
    public static void main(String[] args) {
        long seg_inicial = System.currentTimeMillis();
        for (int i = 1; i <= 500000; i++){
            if(i % 5 == 0)
                System.out.println(i);
        }
        long seg_final = System.currentTimeMillis();
        long dif = seg_final-seg_inicial;
        System.out.println("El programa tardó "+ dif + " milisegundo(s) en ejecutarse");
    }
}

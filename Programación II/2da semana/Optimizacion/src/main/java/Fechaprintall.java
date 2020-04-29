class Fechaprintall{
    public static void main(String[] args) {
        long seg_inicial = System.currentTimeMillis();
        for (int i = 1; i <= 500000; i++){
            System.out.println(i);
        }
        long seg_final = System.currentTimeMillis();
        long dif = seg_final-seg_inicial;
        System.out.println("El programa tardó "+ dif + " milisegundo(s) en ejecutarse");
    }
}

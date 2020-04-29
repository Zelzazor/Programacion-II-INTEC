public class Stackexcepcion{

    private static void StackOverflowEx(){
        StackOverflowEx();
    }
    public static void main(String[] args) {
        StackOverflowEx();
    }
}


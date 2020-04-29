class Practica{
    public static void main(String[] args) {
        byte tipo_byte;
        short tipo_short;
        int tipo_int;
        long tipo_long;
        float tipo_float;
        double tipo_double;
        boolean tipo_boolean;
        char tipo_char;

        tipo_short = 8;

        tipo_int = tipo_short + tipo_short;
        short result_short = (short) (tipo_short + tipo_short);

        tipo_byte = 4;

        byte result_byte = (byte) (tipo_byte + tipo_byte);

        System.out.println(tipo_int);
        System.out.println(result_short);
        System.out.println(result_byte);

        tipo_long = tipo_short + tipo_short;

        System.out.println(tipo_long);
        
        tipo_float = tipo_long + tipo_long;

        System.out.println(tipo_float);

        tipo_double = 48.159;

        tipo_float = (float) tipo_double;

        System.out.println(tipo_float);

        tipo_int = 65;

        //tipo_boolean = (boolean) tipo_int;

        tipo_boolean = true;

        System.out.println(tipo_boolean);

        tipo_char = (char) tipo_int;

        System.out.println(tipo_char);

        tipo_int = (tipo_boolean) ? 1 : 0;

        System.out.println(tipo_int);

    }
}
package day04_concatination;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //-----implicit casting

        byte b = 15;
        short s = (short) b;

        System.out.println("s = " + s);

        int i = b;

        long l = 3000l;

        float f = l;

        //-----explicit casting

        int x = 100;
        byte y = (byte) x;


        float z = 20.8f;
        short q = (short) z;

        double n1 = 2.5;
        byte n2 = (byte) n1;

    }
}

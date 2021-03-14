package lesson1;

public class arithmetic {
    public static void main(String[] args) {
        // + - * / %
        int a = 7, b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((float) a / b); // cast

        int c = 7;
        c++;
        System.out.println(++c);
        System.out.println(c);
        c--;
        System.out.println(c);

        c = 8;
        c = c++ + ++c; // 10 + (7) 8
        System.out.println(c);

        long l = 5;
        int i = 4;
        i = (int) l;
        l = i;

        byte b1 = (byte) 137;
        // 127 -> 128 = -128, 129 = -127, 130 = -126
        System.out.println(b1);
    }
}

package lesson1;

public class MyFirstClass {
    public static void main(String[] args) {
        //Напечатать Привет мир!
        System.out.println("Hello world!");
        //input -> algoritm -> output,так работает любая программа
        byte byteValue = 15;// 1b = 256 т.е от -128 до 127
        short shortValue = 10000;// это уже 2 байта соответ 2^16
        int intValue = 1_000_000_000;// 4 байта соотв 2^32
        long longValue = 1_000_000_000_000l;// 8 байт соотв 2^64
        float floatValue = 0.5f;// при решении,чисел после запятой будет 8
        double doubleValue = 0.5;// при решении,чисел после запятой будет больше 8
        boolean booleanValue = true;//либо false
        char charValue = '=';// в кавычках может содержаться один символ,искл '\'','\\'.

        String hello = "Hello ";
        String world = "world!";



    }
}

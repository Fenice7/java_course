package Homework.HW3;

public class HW3 {


    public static void main(String[] args) {
        //Вычислить пример на бумаге,
        // затем написать программу для вычесления
        //и сравнить результаты

        //Задание №1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l; //-16.7

        System.out.println(result);

        //Задание №2

        int a = 5;
        int b = 8;
        System.out.println(a-- - --a + ++a + a++ + a); //15
        System.out.println(++b - b++ + ++b - --b); //1

    }
}


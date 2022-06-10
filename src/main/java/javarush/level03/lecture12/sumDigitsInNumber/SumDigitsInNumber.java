package javarush.level03.lecture12.sumDigitsInNumber;

import java.util.Arrays;

public class SumDigitsInNumber {
    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(546));

        int[] arr = new int [3];
        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 1;

        Arrays.sort(arr);

        // System.out.print(arr[0]);
        // System.out.print(arr[1]);
        // System.out.print(arr[2]);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        // для трехзначных чисел.
        int f = number / 100; // получаем первое число, тк в интах результат деления без остатка
        int s = (number % 100) / 10; // получаем в скобках остаток от деления, два последний числа, и его также делим и получаем целое число без остатка
        int t = (number % 100) % 10; // получаем в скобках остаток от деления, два последний числа, их делим на 10 и получаем остаток от деления - последнее число

        return f + s + t;
    }


}

package javarush.level05.lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OutMaximumNumber {
//    Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.
//
//Требования:
//•	Программа должна считывать числа с клавиатуры.
//•	Программа должна выводить число на экран.
//•	В классе должен быть метод public static void main.
//•	Нельзя добавлять новые методы в класс Solution.
//•	Программа должна выводить на экран максимальное из введенных N чисел.
//•	Программа не должна ничего выводить на экран, если N меньше либо равно 0.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());              // считывается первое число, которое говорит о кол-ве чисел которые будут вводится

        if (num > 0) {                                              // проверка что первое число больше нуля
            int maximum = Integer.parseInt(reader.readLine());;     // считывается первое число из проверяемых
            for (int i = 0; i < num - 1 ; i++) {                    // делаем цикл, кол-во кругов равны первое введеное число -1 (-1 потому что одно число мы считали вне цикла)
                int nextNum = Integer.parseInt(reader.readLine());  // считываем второе число
                maximum = Math.max(maximum, nextNum);               // проверяем какое число из двух максимальное
            }
            System.out.println(maximum);
        }
        //напишите тут ваш код


    }
}

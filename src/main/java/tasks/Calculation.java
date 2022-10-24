package tasks;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        // Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
        // Для ввода чисел в формате double использовать запятую, при точке вылетает исключение
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        double firstNum = in.nextDouble();
        System.out.println("Input second number: ");
        double secondNum = in.nextDouble();

        System.out.println("Result: " + firstNum*secondNum);
    }



}

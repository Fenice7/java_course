package tasks;

import java.util.Scanner;

public class CalculationNumbers {

    //Пользователь вводит два числа. Найдите сумму и произведение данных чисел.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввестите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();

        int sum = a + b;
        int prod = a * b;

        System.out.println("Сумма чисел равна: " + sum);
        System.out.println("Произведение чисел равно: " + prod);
    }
}

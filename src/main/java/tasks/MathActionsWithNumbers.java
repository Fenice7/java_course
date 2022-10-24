package tasks;

import java.util.Scanner;

public class MathActionsWithNumbers {

    public static void main(String[] args) {
        findSpeed();
    }

    public static void findSpeed() {
        //Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time in minutes:");
        int timeInMinutes = scan.nextInt();
        System.out.println("Enter distance in km:");
        int distanceInKm = scan.nextInt();

        int speed = (distanceInKm * 1000) / (timeInMinutes * 60);

        System.out.println("Speed is - " + speed + " m/s");
    }

    public static void purchasePrise() {
        //Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
        //а) одной покупки из 300 г конфет и 400 г печенья;
        //б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price 1 kg candies:");
        int candy = scan.nextInt();
        System.out.println("Enter price 1 kg cookies:");
        int cookies = scan.nextInt();

        double first = (candy * 0.3) + (cookies * 0.4);
        double second = ((cookies * 2) + (candy * 1.8)) * 3;

        System.out.println("A = " + first);
        System.out.println("B = " + second);
    }

    public static void sumNumbersWithChanges() {
        //Пользователь вводит три числа.
        //Увеличьте первое число в два раза,
        //второе числа уменьшите на 3,
        //третье число возведите в квадрат
        //и затем найдите сумму новых трех чисел.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scan.nextInt();
        System.out.println("Enter second number:");
        int second = scan.nextInt();
        System.out.println("Enter third number:");
        int third = scan.nextInt();

        int sum = (first * 2) + (second - 3) + (third * third);
        System.out.println("The sum of all numbers with changes is - " + sum);
    }

    public static void averageAndDifference() {
        //Пользователь вводит три числа.
        //Найдите среднее арифметическое этих чисел,
        //а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scan.nextInt();
        System.out.println("Enter second number:");
        int second = scan.nextInt();
        System.out.println("Enter third number:");
        int third = scan.nextInt();

        int average = (first + second + third) / 3;
        System.out.println("Average of tree numbers is - " + average);

        int diff = (first * 2) - (third * 2) - (second * 3);
        System.out.println("Difference of numbers is - " + diff);
    }

    public static void perimeterAndAreaOfSquare() {
        //Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of a square:");
        int side = scan.nextInt();

        int perimeter = side * 4;
        double area = Math.pow(side, 2);

        System.out.println("Perimeter of square is - " + perimeter);
        System.out.println("Area of square is - " + area);
    }
}

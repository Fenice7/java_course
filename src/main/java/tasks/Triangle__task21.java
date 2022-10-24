package tasks;

import java.util.Scanner;

public class Triangle__task21 {
    //Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first side of the triangle");
        int first = scan.nextInt();

        System.out.println("Enter second side of the triangle");
        int second = scan.nextInt();

        //площадь Площадь прямоугольного треугольника равна половине произведения катетов. S = (ab):2.
        int square = (first * second) / 2;
        System.out.println("Square of triangle is - " + square);

        //гипотенуза - сумма квадратов двух катетов равняется квадрату гипотенузы
        double hypotenuse = Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2));
        System.out.println("Hypotenuse of triangle is - " + hypotenuse);

        //перимерт - сумма сторон
        double perimeter = first + second + hypotenuse;
        System.out.println("Perimeter triangle is - " + perimeter);



    }
}

package tasks;

import java.util.Scanner;

public class SquareAndCubeNumber {

    //Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scan.nextInt();
        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        System.out.println("Square " + num + " is - " + square);
        System.out.println("Cube " + num + " is - " + cube);
    }
}

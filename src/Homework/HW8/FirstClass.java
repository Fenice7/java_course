package Homework.HW8;

public class FirstClass {

    static int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println("Целое частное от деления " + a + " и " + b + " = " + a / b);
        System.out.println("Остаток от деления " + a + " и " + b + " = " + a % b);
    }

    final static double PI = 3.14;

    double ploshadKruga(double radius) {
        return PI * (radius * radius);
    }

    static double dlinaKruga(double radius) {
        return 2 * PI * radius;
    }

    void info(double radius) {
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + ploshadKruga(radius));
        System.out.println("Длина окружности = " + dlinaKruga(radius));
    }


}

class SecondClass {
    public static void main(String[] args) {
        int result = FirstClass.multiplication(2, 7, 9);
        int result2 = FirstClass.multiplication(3, 3, 3);
        System.out.println(result);
        System.out.println(result2);
        FirstClass.division(5, 2);
        FirstClass.division(4, 3);
        System.out.println();

        //KRUG

        FirstClass fc = new FirstClass();
        double ploshad = fc.ploshadKruga(12);
        System.out.println("Площадь круга = " + ploshad);

        double dlinaKruga = FirstClass.dlinaKruga(23);
        System.out.println("Длина круга = " + dlinaKruga);

        fc.info(3);
    }
}

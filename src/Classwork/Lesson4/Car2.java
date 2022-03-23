package Classwork.Lesson4;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz (int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo () {
        System.out.println("cvet " + color + " motor " + engine + " skorost " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(50);
        c1.showInfo();
    }
}

class Test20 {
    int summa (int a, int b, int c) {
        return a+b+c;
    }

    int sreedneeArifm(int a1, int b1, int c1) {
        return summa(a1, b1, c1)/3;
    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 t20 = new Test20();
        System.out.println(t20.summa(2,5,7));
        System.out.println(t20.sreedneeArifm(50, 30, 10));
    }
}


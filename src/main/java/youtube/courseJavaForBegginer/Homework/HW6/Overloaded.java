package youtube.courseJavaForBegginer.Homework.HW6;

public class Overloaded {

    int summa() {
        return 0;
    }

    int summa(int a) {
        return a;
    }

    int summa(int a, int b) {
        return a+b;
    }

    int summa(int a, int b, int c) {
        return a+b+c;
    }

    int summa(int a, int b, int c, int d) {
        return a+b+c+d;
    }

}

class OverloadedTest {
    public static void main(String[] args) {
        Overloaded object = new Overloaded();
        System.out.println(object.summa());
        System.out.println(object.summa(2));
        System.out.println(object.summa(2, 9));
        System.out.println(object.summa(2,5,1));
        System.out.println(object.summa(2,5,1,9));
    }

}

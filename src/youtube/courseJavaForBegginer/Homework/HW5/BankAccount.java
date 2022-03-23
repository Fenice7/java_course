package youtube.courseJavaForBegginer.Homework.HW5;

public class BankAccount {

    static double balance = 567.09;

    static double popolnenieScheta(double a) {
        return balance + a;

    }

    static double snyatieSoScheta(double b) {
        return balance - b;

    }



    public static void main(String[] args) {
        double c = snyatieSoScheta(30);
        System.out.println(c);
        double n = popolnenieScheta(560.06);
        System.out.println(n);

    }

}

package javarush.level09.lecture03;

public class ExseptionsJR {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int result = 0;
        System.out.println("Start");

        try{
            System.out.println("We are in try block");
            result = a / 2;
            System.out.println("After delenia na nol");
        } catch (ArithmeticException e) {
            System.out.println("We are in catch block");
            System.out.println(e);
        }

        System.out.println("We are in main method");

    }
}

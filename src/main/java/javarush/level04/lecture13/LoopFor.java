package javarush.level04.lecture13;

public class LoopFor {

    public static void main(String[] args) {
        // Обратный равносторонний трейгольник
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        //равносторонний треугольник

        String s = "";
        for (int a = 0; a < 10; a++) {
            System.out.println(s+=8);
        }
    }
}

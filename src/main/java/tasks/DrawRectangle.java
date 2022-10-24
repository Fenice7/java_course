package tasks;

public class DrawRectangle {

    //Вывести на экран прямоугольник, заполненный буквами А.
    //Количество строк в прямоугольнике равно 5, количество столбцов равно 8

    public static void main(String[] args) {
        String a = "A";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("*         *         *");
        System.out.println("  *     *   *     *");
        System.out.println("    *  *     *  *");
        System.out.println("      *       *");
    }
}

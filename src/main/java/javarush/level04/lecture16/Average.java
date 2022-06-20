package javarush.level04.lecture16;

public class Average {

    // выводим на экран среднее из введеных чисел

    public static int median(int a, int b, int c) {
        int s = Math.min(a, b); // находим мин число из двух первых
        int d = Math.max(a, b); // находим макс число из двух первых
        int v = Math.min(d, c); // находим мин из макс двух первых чисел и третьего
        return Math.max(s, v); // выводим максимальное из минимальных
    }

    public static void main(String[] args) {
        System.out.println(median(0, 2, 5));
    }
}

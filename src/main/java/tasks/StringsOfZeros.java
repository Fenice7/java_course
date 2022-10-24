package tasks;

public class StringsOfZeros {

    //Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
    public static void main(String[] args) {
        String s = "";
        for (int a = 0; a < 5; a++) {
            System.out.println(s+=0);
        }
    }
}

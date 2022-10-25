package javarush.level08.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortArrayAlphabet {

    // Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
    //
    //Требования:
    //•	Программа должна выводить текст на экран.
    //•	Программа должна считывать значения с клавиатуры.
    //•	Класс Solution должен содержать три метода.
    //•	Метод main() должен вызывать метод sort().
    //•	Метод sort() должен вызывать метод isGreaterThan().
    //•	Выведенные слова должны быть отсортированы в алфавитном порядке.

    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        array[0]  = "Moscow";
        array[1]  = "Yandex";
        array[2]  = "Arabica";
        array[3]  = "Wonder";
        array[4]  = "Cat";
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reader.readLine();
//        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(isGreaterThan(array[i], array[j])) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

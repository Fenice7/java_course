package javarush.level07.lecture12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {
    // В убывающем порядке
    //Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
    //
    //
    //Requirements:
    //1. Программа должна считывать 20 целых чисел с клавиатуры.
    //2. Программа должна выводить 20 чисел.
    //3. В классе Solution должен быть метод public static void sort(int[] array).
    //4. Метод main должен вызывать метод sort.
    //5. Метод sort должен сортировать переданный массив по убыванию.

    public static void main(String[] args) throws Exception {

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 1 + (int) (Math.random() * 20);
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}

package codeWars;

import java.util.Scanner;

public class JavaEndOfFile {

    /**
     * Задача здесь состоит в том, чтобы прочитать n строк ввода, пока не дойдете до EOF, затем пронумеровать и распечатать все n строк содержимого.
     * Подсказка: Java-метод Scanner.hasNext() помогает решить эту проблему.
     * Формат ввода:
     * Прочитайте несколько неизвестных n строк ввода из stdin(System.in), пока не дойдете до EOF; каждая строка ввода содержит непустую строку.
     * Формат вывода:
     * Для каждой строки выведите номер строки, за которым следует один пробел, а затем содержимое строки, полученное в качестве входных данных.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; scanner.hasNext(); i++) {
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }

}

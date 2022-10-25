package javarush.level07.lecture06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheShortestOrLongestString {

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//    Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }

        int minStr = array.get(0).length();
        int maxStr = array.get(0).length();

        for(int i = 1; i < array.size(); i++) {
            if(minStr > array.get(i).length()) {
                minStr = array.get(i).length();
            } else if (maxStr < array.get(i).length()) {
                maxStr = array.get(i).length();
            }
        }

        for(int i = 0; i < array.size(); i++) {
            if(minStr == array.get(i).length()) {
                System.out.println(array.get(i));
                break;
            } else if (maxStr == array.get(i).length()) {
                System.out.println(array.get(i));
                break;
            }
        }
    }

}

package javarush.level07.lecture06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindTheShortestString {

    //1. Создай список строк.
    //2. Считай с клавиатуры 5 строк и добавь в список.
    //3. Используя цикл, найди самую короткую строку в списке.
    //4. Выведи найденную строку на экран.
    //5. Если таких строк несколько, выведи каждую с новой строки.

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // add strings in list
        for(int i = 0; i < 5; i++) {
            strList.add(reader.readLine());
        }

        // variable with start value
        int minStr = strList.get(0).length();

        // find min word in list
        for(int i = 1; i < strList.size(); i++) {
            if (minStr > strList.get(i).length()) {
                minStr = strList.get(i).length();
            }
        }

         ArrayList<String> minStrings = new ArrayList<>();

        for (String s : strList) {
            if (minStr == s.length()) {
                minStrings.add(s);
            }
        }

         for(String el : minStrings) {
             System.out.println(el);
         }

    }

}

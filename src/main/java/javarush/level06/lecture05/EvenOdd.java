package javarush.level06.lecture05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

//    Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
//Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
//Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
//
//Пример для числа 4445:
//Even: 3 Odd: 1

    //              for ( int i=0; i<s.length(); i++ )
    //            n = "02468".contains( s.substring(i,i+1) ) ? even++ : odd++;

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {                                              // проверка, что введенное число положительное
            while (num != 0) {
                int i = (num % 10) % 2 == 0 ? even++ : odd++;       // тернарный if. число(89756) делим на 10, остаток(6) делим на 2, если остаток деления на 2 = 0 число (+), если не равен (-)
                num = num / 10;                                     // присваиваем переменной число поделенное на 10, т.к int записывается результат без остатка
            }
            System.out.println("Even: " + even + " Odd: " + odd);
        }
    }
}

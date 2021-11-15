package Classwork.Lesson3;

public class Lesson3 {


    public static void main(String[] args) {
        //Если делить данные типа int с остатком, остаток отсекается
        System.out.println(11 / 3); // 3

        // знак % показывает остаток от деления
        System.out.println(11 % 3); // 2

        // унарные операторы ++ и --
        // prefix - ++a; сначала переменная увеличивает/уменьшая на 1 и только потом выполняется действие
        // postfix - --a; сначала выполняется дейстивие и только потом переменная увеличивает/уменьшая на 1
        int a = 3;
        int d = 12;
        int c = ++a + d--;
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);

        //Операторы присваивания
        // "+=" сначала выполняется действие с числом, а потом полученое значение присваивается переменной
        a -= 2;
        System.out.println(a);

        // Операторы сравнения выдают только true или false
        System.out.println(a > d);

        //с типом boolean нельзя выполнять математические операторы

        // Логические операторы работают только с boolean
        // AND - && - возвращает true, только если все условия true
        // OR - || - возвращает true, если хоть одно из условий true
        // short circuit - не всегда полностью выполняются; Если с оператором AND первое условие false, последующие не будут выполнятся, тк выражение уже false;
        System.out.println("Logical:");
        boolean q = false;
        boolean r = false;
        boolean h = true;
        boolean resault = q && r && h;

        System.out.println(resault);

        // ! - знак отрицания
        System.out.println("Знак отрицания:");
        System.out.println(!r);

        // & - bitwise and
        // || - bitwise or
        // Используются когда нужно чтобы отработали все условия

        System.out.println("Bitwise operators");
        int l = 1;

        System.out.println(q && l++ > 12); //false, l = 1
        System.out.println(l);

        System.out.println(q & l++ > 12); //false, l = 2
        System.out.println(l);

        System.out.println("Побитовые операторы");
        // Могут использоваться с числами. Побитовые операторы
        // 10 & 5 == 1010 & 0101
        // Числа переводятся в двоичную систему и сравниваются
        System.out.println(5 & 10 ); // 0 = false
        System.out.println(5 | 10 ); // 15

        // ^ - оператор bitwise exclusive or
        // возвращает true только в случае если одно выражение возвращает true
        System.out.println("^ - оператор bitwise exclusive or:");
        System.out.println(true ^ false ^ true); // false
        System.out.println(false ^ false ^ false); // false
        System.out.println(true ^ true ^ true); // false - но true
        System.out.println(true ^ false ^ false); // true
        System.out.println(false ^ false ^ true); // true

        System.out.println(10 + 'h');



    }


}

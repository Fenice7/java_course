package codewars;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DescendingOrder2 {

    //Your task is to make a function that can take any non-negative integer
    // as an argument and return it with its digits in descending order.
    // Essentially, rearrange the digits to create the highest possible number.
    //
    //Examples:
    //Input: 42145 Output: 54421
    //
    //Input: 145263 Output: 654321
    //
    //Input: 123456789 Output: 987654321

    public static int descOrder(int num) {
        // Проверка числа на 0
        if (num == 0) return num;

        // Создать переменную в которой будет храниться новое число
        int returnedNum = 0;

        // в цикле проверка начиная с самого большого числа
        for (int i = 9; i >= 0; i--) {
            // доп переменной присвоить значение входящей переменной
            int tempNum = num;
            // в цикле while с проверкой пока число больше нуля
            while (tempNum > 0) {
                // присвоить переменной остаток от деления на 10 доп входящей переменной
                int digit = tempNum % 10;
                // если остаток от деления равен числу из первого цикла
                if (digit == i) {
                    // переменную в которой хранится новое число умножить на 10
                    returnedNum *= 10;
                    // и прибавить к ней остаток от деления
                    returnedNum += digit;
                }
                // после блока if временную переменную разделить на 10, чтобы изменить число счетчика в цикле while
                tempNum /= 10;
            }
        }
        return returnedNum;
    }

    @Test
    void make() {
        Assert.assertEquals(54421, descOrder(42145));
        Assert.assertEquals(0, descOrder(0));
        Assert.assertEquals(654321, descOrder(145263));
        Assert.assertEquals(987654321, descOrder(123456789));
    }
}

package tasks;

import org.testng.Assert;

public class Reverse {
    public static void main(String[] args) {
        String r = reverseString("privet");
        System.out.println(r);
        Assert.assertEquals(r, "tevirp");

    }
    public static String reverseString(String str) {
        var result = "";
        // Счетчик увеличивается с помощью инкремента.
        // Об этой операции мы поговорим ниже.
        for (var i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }


        return result;
    }
}

package tasks;

public class EncryptString {

    public static void main(String[] args) {
        System.out.println(encrypt("move"));
        System.out.println(encrypt("attack"));
        System.out.println(encrypt("og!"));
        System.out.println(encrypt("gogo!"));

    }

    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        String result = "";
        // для слов с нечетным кол-вом букв
        if (str.length() % 2 != 0) { // если в строке нечетное кол-во символов
            String even = str.substring(0, str.length() - 1);
            char lastChar = str.charAt(str.length() - 1);
            for (int i = 0; i < even.length() - 1; i += 2) {
                char nextSymbol = str.charAt(i + 1);
                result = result + nextSymbol + str.charAt(i);
            }
            return result + lastChar;
            // для слов с четным кол-вом букв
        } else {
            for (int k = 0; k < str.length() - 1; k += 2) {
                char nextSymbol = str.charAt(k + 1);
                result = result + nextSymbol + str.charAt(k);
            }
        }
        return result;
    }
}

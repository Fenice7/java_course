package tasks;

public class FindLetterInWord {

    public static void main(String[] args) {
        System.out.println(hasChar("Renly", 'w'));
    }

    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ch) {
                return true;
            }
        }
        return false;
        // END
    }
}

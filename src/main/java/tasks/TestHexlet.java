package tasks;

public class TestHexlet {

    public static String getHiddenCard(String cardNumber, int numberOfStars) {
        return "*".repeat(numberOfStars) + cardNumber.substring(12);
    }

    public static String getHiddenCard(String cardNumber) {
        return "*".repeat(4) + cardNumber.substring(12);
    }



    public static void main(String[] args) {
        System.out.println(TestHexlet.getHiddenCard("1223433434343422", 1));
        System.out.println(TestHexlet.getHiddenCard("1223433434343422"));
    }
}

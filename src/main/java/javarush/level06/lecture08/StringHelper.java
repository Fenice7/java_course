package javarush.level06.lecture08;

public class StringHelper {

    //Сделать класс StringHelper, у которого будут 2 статических метода:
    //String multiply(String s, int count) - возвращает строку повторенную count раз.
    //String multiply(String s) - возвращает строку повторенную 5 раз.
    //
    //Пример:
    //Амиго -> АмигоАмигоАмигоАмигоАмиго

    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i ++) {
            result += text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i ++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo", 5));
        System.out.println(multiply("Amigo"));
    }
}

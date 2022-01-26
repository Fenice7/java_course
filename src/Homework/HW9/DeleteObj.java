package Homework.HW9;

public class DeleteObj {

    String someText = "Privet";

    public DeleteObj(String someText) {
        this.someText = someText;
    }

    public static void main(String[] args) {
        DeleteObj obj1 = new DeleteObj("Privet obj 1");
        DeleteObj obj2 = new DeleteObj("Privet obj 2");
        DeleteObj obj3 = new DeleteObj("Privet obj 3");
        DeleteObj obj4 = new DeleteObj("Privet obj 4");
        DeleteObj obj5 = new DeleteObj("Privet obj 5");
        DeleteObj obj6 = new DeleteObj("Privet obj 6");
        DeleteObj obj7 = new DeleteObj("Privet obj 7");
        DeleteObj obj8 = new DeleteObj("Privet obj 8");

        obj4 = obj3;
        obj3 = null;
        obj5 = obj4;

        System.out.println(obj1.someText);


    }
}

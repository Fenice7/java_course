package javarush.level02.lecture10.datingWebsite;

public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public static void main(String[] args) {
        User user = new User("Vova", 188, (short) 23);
        System.out.println("User name is " + user.name);
        System.out.println("User age is " + user.age);
        System.out.println("User height is " + user.height);
    }


}

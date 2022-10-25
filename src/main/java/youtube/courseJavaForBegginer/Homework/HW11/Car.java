package youtube.courseJavaForBegginer.Homework.HW11;

import static youtube.courseJavaForBegginer.Homework.HW11.Car.*;

public class Car {

    // Создайте класс Car с тремя переменными: цвет, мотор, кол-во дверей
    // Затем создайте класс CarTest, в котором должны быть два метода.
    // Первый изменяет кол-во дверей объекта Car на кол-во, прописанное параметре метода.
    // Второй принимает в параметры 2 объекта класа Car и меняет их цвета местами.
    // Примените оба метода в main и выведите на экран атрибуты всех объектов

    public String color;
    public String motor;
    public int countDoors;

    public Car(String color, String motor, int countDoors) {
        this.color = color;
        this.motor = motor;
        this.countDoors = countDoors;
    }

    public static void changeDoorsCount(Car c, int newDoorsCount) {
        c.countDoors = newDoorsCount;
    }

    public static void changeCarsColor(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }

}

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("black", "v1", 4);
        Car car2 = new Car("red", "v6", 2);
        changeDoorsCount(car1, 5);
        System.out.println(car1.countDoors);
        changeCarsColor(car1, car2);

        System.out.println("Color first car is - " + car1.color);
        System.out.println("Motor first car is - " + car1.motor);
        System.out.println("Doors count first car is - " + car1.countDoors);
        System.out.println();
        System.out.println("Color second car is - " + car2.color);
        System.out.println("Motor second car is - " + car2.motor);
        System.out.println("Doors second first car is - " + car2.countDoors);
    }


}
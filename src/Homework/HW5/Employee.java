package Homework.HW5;

public class Employee {

    int id;
    int age;
    double salary;
    String surname;
    String departament;

    public Employee(int id, int age, double salary, String surname, String departament) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.surname = surname;
        this.departament = departament;
    }

    double uvelechenieZP(){
        salary *= 2;
        return salary;
    }

}

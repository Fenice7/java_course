package Homework.HW5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 27, 768.50, "Kovolev", "IT");
        Employee emp2 = new Employee(2, 34, 876, "Ivanov", "managment");

        System.out.println(emp1.uvelechenieZP());
        System.out.println(emp2.uvelechenieZP());

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}

package Classwork.Lesson11;

public class Employee {

    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelicitel (double a) {
        a = a * 2;
        return a;
    }

    public double z1 () {
        salary=salary*2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelicitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.z1();
        System.out.println(emp1.salary);
    }
}

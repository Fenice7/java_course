package youtube.courseJavaForBegginer.Homework.HW7;

public class EmployeeAccessModif {

    int id;
    int age;
    private double salary;
    public String surname;
    String departament;

    public EmployeeAccessModif(String surname, int id) {
        this.surname = surname;
        this.id = id;
    }

    EmployeeAccessModif(int id, int age, double salary, String surname, String departament) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.surname = surname;
        this.departament = departament;
    }

    private EmployeeAccessModif(int id, String surname, String departament) {
        this.id = id;
        this.surname = surname;
        this.departament = departament;
    }

   public void showId() {
       System.out.println(id);
   }

   public void showSalary() {
       System.out.println(salary);
   }

   public void showSurname() {
       System.out.println(surname);
   }


}

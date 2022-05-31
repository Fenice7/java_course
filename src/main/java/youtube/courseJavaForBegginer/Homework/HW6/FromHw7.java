package youtube.courseJavaForBegginer.Homework.HW6;

import youtube.courseJavaForBegginer.Homework.HW7.EmployeeAccessModif;

public class FromHw7 {
    public static void main(String[] args) {
        EmployeeAccessModif empPublic = new EmployeeAccessModif("Morg", 34);
//        EmployeeAccessModif empDef = new EmployeeAccessModif(56, 34, 3453, "Volk", "QA");

        empPublic.showId();
        empPublic.showSalary();
        empPublic.showSurname();
        System.out.println(empPublic.surname);
    }
}

package youtube.courseJavaForBegginer.Homework.HW7;

public class EmployeeAccessModifTest {
    public static void main(String[] args) {
        EmployeeAccessModif empPublic = new EmployeeAccessModif("Petrov", 3);
        EmployeeAccessModif emp2Def= new EmployeeAccessModif(1, 30, 2222.25, "Solovey", "HR");
//        EmployeeAccessModif empPriv = new EmployeeAccessModif(23, "Slon", "IT");

        System.out.println("Info empPublic:");
        empPublic.showId();
        empPublic.showSalary();
        empPublic.showSurname();
        System.out.println(empPublic.age);
        System.out.println(empPublic.departament);
        System.out.println();

        System.out.println("Info empDef:");
        System.out.println(emp2Def.id);
        emp2Def.showId();
        System.out.println(emp2Def.age);
        emp2Def.showSalary();
        System.out.println(emp2Def.surname);
        emp2Def.showSurname();
        System.out.println(emp2Def.departament);

//        System.out.println(empPriv.id);
//        empPriv.showId();
//        System.out.println(empPriv.age);
//        empPriv.showSalary();
//        System.out.println(empPriv.surname);
//        empPriv.showSurname();
//        System.out.println(empPriv.departament);






    }
}

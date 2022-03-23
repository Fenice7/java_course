package youtube.courseJavaForBegginer.Homework.HW4;

public class Student {

    public String name;
    public String surname;
    public int id;
    public int yearOfStudy;
    public double mathematicsRating;
    public double economicsRating;
    public double languageRating;

    public double mediumRating(double mathematicsRating1, double economicsRating2, double languageRating2) {
        return (mathematicsRating1 + economicsRating2 + languageRating2) / 3;

    }

    Student(String name, String surname, int id, int yearOfStudy, double mathematicsRating, double economicsRating, double languageRating) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.mathematicsRating = mathematicsRating;
        this.economicsRating = economicsRating;
        this.languageRating = languageRating;

    }

    Student(int id, String name, String surname, int yearOfStudy) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
    }

    Student() {

    }
}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();

        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.id = 1;
        st1.yearOfStudy = 5;
        st1.mathematicsRating = 4.5;
        st1.economicsRating = 4.5;
        st1.languageRating = 4.6;

        System.out.println("Средняя оценка студента " + st1.name + " " + st1.surname + " - " + st1.mediumRating(st1.mathematicsRating, st1.economicsRating, st1.languageRating));


        Student st2 = new Student(2, "Petr", "Petrov", 3);
        st2.mathematicsRating = 3.3;
        st2.economicsRating = 3.5;
        st2.languageRating = 4;

        System.out.println("Средняя оценка студента " + st2.name + " " + st2.surname + " - " + st2.mediumRating(st2.mathematicsRating, st2.economicsRating, st2.languageRating));

        Student st3 = new Student("Sergey", "Solncev", 5, 5, 4.3, 5.5, 3.2);

        System.out.println("Средняя оценка студента " + st3.name + " " + st3.surname + " - " + st3.mediumRating(st3.mathematicsRating, st3.economicsRating, st3.languageRating));
    }


}

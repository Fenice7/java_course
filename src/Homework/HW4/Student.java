package Homework.HW4;

public class Student {

    public String studentName;
    public String studentSurname;
    public int numberStudentTicket;
    public int yearOfStudy;
    public double mathematicsRating;
    public double economicsRating;
    public double languageRating;

    public double mediumRating(double mathematicsRating1, double economicsRating2, double languageRating2) {
        double mediumRathing = (mathematicsRating1 + economicsRating2 + languageRating2) / 3;
        return mediumRathing;

    }

}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();

        st1.studentName = "Ivan";
        st1.studentSurname = "Ivanov";
        st1.numberStudentTicket = 1;
        st1.yearOfStudy = 5;
        st1.mathematicsRating = 4.5;
        st1.economicsRating = 4.5;
        st1.languageRating = 4.6;

        System.out.println("Средняя оценка студента " + st1.studentName + " " + st1.studentSurname + " - " + st1.mediumRating(st1.mathematicsRating, st1.economicsRating, st1.languageRating));


        Student st2 = new Student();
        st2.studentName = "Petr";
        st2.studentSurname = "Petrov";
        st2.numberStudentTicket = 2;
        st2.yearOfStudy = 3;
        st2.mathematicsRating = 3.3;
        st2.economicsRating = 3.5;
        st2.languageRating = 4;

        System.out.println("Средняя оценка студента " + st2.studentName + " " + st2.studentSurname + " - " + st2.mediumRating(st2.mathematicsRating, st2.economicsRating, st2.languageRating));

        Student st3 = new Student();
        st3.studentName = "Sergey";
        st3.studentSurname = "Solncev";
        st3.numberStudentTicket = 5;
        st3.yearOfStudy = 1;
        st3.mathematicsRating = 5;
        st3.economicsRating = 4.8;
        st3.languageRating = 5;

        System.out.println("Средняя оценка студента " + st3.studentName + " " + st3.studentSurname + " - " + st3.mediumRating(st3.mathematicsRating, st3.economicsRating, st3.languageRating));

    }






}

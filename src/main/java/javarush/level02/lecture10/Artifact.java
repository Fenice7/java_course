package javarush.level02.lecture10;

public class Artifact {

    int number;
    String culture;
    int ageOfCreation;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int ageOfCreation) {
        new Artifact(number, culture);
        this.ageOfCreation = ageOfCreation;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(1);
        Artifact artifact2 = new Artifact(1, "Brazil");
        Artifact artifact3 = new Artifact(1, "Chili", 11);

        System.out.println(artifact3.ageOfCreation);
    }

}

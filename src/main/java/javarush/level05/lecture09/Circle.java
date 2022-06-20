package javarush.level05.lecture09;

public class Circle {

    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());

        circle.color.setDescription("blue");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color();
    }

}

class Color {
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
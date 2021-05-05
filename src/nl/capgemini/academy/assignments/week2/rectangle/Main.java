package nl.capgemini.academy.assignments.week2.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 3);
        Rectangle rectangle2 = new Rectangle(6, 5);

        System.out.println(rectangle1.calculateSurface());
        System.out.println(rectangle2.calculateSurface());
        System.out.println(rectangle1.calculateCircumference());
        System.out.println(rectangle2.calculateCircumference());

        // BONUS
        Rectangle rectangle3 = new Rectangle(4, 5);
        System.out.println(rectangle3);

        Rectangle rectangle4 = new Rectangle(7, 8, "Pink");
        System.out.println(rectangle4);
    }
}

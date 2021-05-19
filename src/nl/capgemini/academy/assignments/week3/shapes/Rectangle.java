package nl.capgemini.academy.assignments.week3.shapes;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}

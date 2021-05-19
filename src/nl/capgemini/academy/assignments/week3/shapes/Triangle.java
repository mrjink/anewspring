package nl.capgemini.academy.assignments.week3.shapes;

public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        // Calculate the area using Heron's Formula: https://en.wikipedia.org/wiki/Heron%27s_formula
        double s = getCircumference() / 2.0d;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

package nl.capgemini.academy.assignments.week3.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(4, 5));
        shapes.add(new Rectangle(4, 4));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new RightTriangle(5, 12));
        shapes.add(new EquilateralTriangle(4));
        shapes.add(new IsoscelesTriangle(6, 5));

        for (Shape shape : shapes) {
            printShape(shape);
        }
    }

    private static void printShape(Shape shape) {
        System.out.println("Name: " + shape.getName());
        System.out.println("Circumference: " + shape.getCircumference());
        System.out.println("Area: " + shape.getArea());
        System.out.println();
    }
}

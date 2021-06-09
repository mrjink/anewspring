package nl.capgemini.academy.assignments.week3.shapes;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double side) {
        super(base, side, side);
    }

    @Override
    public String getName() {
        return "Isosceles Triangle";
    }
}

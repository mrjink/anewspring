package nl.capgemini.academy.assignments.week3.shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public String getName() {
        return "Equilateral Triangle";
    }
}

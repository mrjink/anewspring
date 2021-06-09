package nl.capgemini.academy.assignments.week3.shapes;

public class Square extends Rectangle {
    public Square(double width) {
        super(width, width);
    }

    @Override
    public String getName() {
        return "Square";
    }
}

package nl.capgemini.academy.assignments.week3.shapes;

public class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        // Use Pythagorean Theorem to calculate hypotenuse: https://en.wikipedia.org/wiki/Pythagorean_theorem
        super(base, height, Math.sqrt(base * base + height * height));
    }

    @Override
    public String getName() {
        return "Right Triangle";
    }
}

package nl.capgemini.academy.assignments.week2.rectangle;

public class Rectangle {
    private int height;
    private int width;
    private String color;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Rectangle(int height, int width) {
        this(height, width, "No Color");
    }

    public int calculateSurface() {
        return height * width;
    }

    public int calculateCircumference() {
        return 2 * height + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
               "height=" + height +
               ", width=" + width +
               ", color='" + color + '\'' +
               ", circumference=" + calculateCircumference() +
               ", surface=" + calculateSurface() +
               '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

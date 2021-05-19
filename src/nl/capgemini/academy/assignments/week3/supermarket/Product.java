package nl.capgemini.academy.assignments.week3.supermarket;

public class Product implements Comparable<Product> {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        return getName().compareTo(o.getName());
    }
}

package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;

public interface ProductDiscount {
    int getPrice(Product product, int num);

    String getText();
}

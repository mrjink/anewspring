package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeekProductDiscountTest {

    private Product product;
    private DayOfWeek today;
    private DayOfWeek tomorrow;

    @BeforeEach
    void setup() {
        product = new Product("Test", 1000);
        today = LocalDate.now().getDayOfWeek();
        tomorrow = LocalDate.now().plusDays(1).getDayOfWeek();
    }

    @Test
    void getPrice_today_a() {
        ProductDiscount discount = new DayOfWeekProductDiscount(today, 750);
        int price = discount.getPrice(product, 1);
        assertEquals(750, price);
    }

    @Test
    void getPrice_today_b() {
        ProductDiscount discount = new DayOfWeekProductDiscount(today, 750);
        int price = discount.getPrice(product, 2);
        assertEquals(1500, price);
    }

    @Test
    void getPrice_tomorrow_a() {
        ProductDiscount discount = new DayOfWeekProductDiscount(tomorrow, 750);
        int price = discount.getPrice(product, 1);
        assertEquals(1000, price);
    }

    @Test
    void getPrice_tomorrow_b() {
        ProductDiscount discount = new DayOfWeekProductDiscount(tomorrow, 750);
        int price = discount.getPrice(product, 2);
        assertEquals(2000, price);
    }

}
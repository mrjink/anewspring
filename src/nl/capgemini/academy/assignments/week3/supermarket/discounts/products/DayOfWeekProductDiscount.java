package nl.capgemini.academy.assignments.week3.supermarket.discounts.products;

import nl.capgemini.academy.assignments.week3.supermarket.Product;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekProductDiscount implements ProductDiscount {
    private final DayOfWeek dayOfWeek;
    private final int price;

    public DayOfWeekProductDiscount(DayOfWeek dayOfWeek, int price) {
        this.dayOfWeek = dayOfWeek;
        this.price = price;
    }

    @Override
    public int getPrice(Product product, int num) {
        if (LocalDate.now().getDayOfWeek().equals(dayOfWeek)) {
            return num * price;
        }
        return num * product.getPrice();
    }

    @Override
    public String getText() {
        return String.format("Op %s voor € %.2f per stuk",
                getDayOfWeekDisplayName(),
                price / 100.0d);
    }

    private String getDayOfWeekDisplayName() {
        return dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, new Locale("nl", "NL"));
    }
}

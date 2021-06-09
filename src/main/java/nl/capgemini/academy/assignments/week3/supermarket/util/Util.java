package nl.capgemini.academy.assignments.week3.supermarket.util;

public final class Util {
    private Util() {
    }

    public static int round(int total) {
        // rounds to the nearest 5 cents
        return ((total + 2) / 5) * 5;
    }
}

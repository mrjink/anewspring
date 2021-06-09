package nl.capgemini.academy.assignments.week1.for_if.a3;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
    }

    private static void part1() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        // Alternatively: int[] numbers = new int[]{1, 2, 3, 4, 5};
        printNumbersForEach(numbers);
        printNumbersForLoop(numbers);
    }

    private static void part2() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        printNumbersForEach(numbers);
        printNumbersForLoop(numbers);
    }

    private static void printNumbersForEach(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printNumbersForLoop(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
    }
}

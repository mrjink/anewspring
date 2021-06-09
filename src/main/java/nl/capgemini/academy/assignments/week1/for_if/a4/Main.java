package nl.capgemini.academy.assignments.week1.for_if.a4;

public class Main {
    public static void main(String[] args) {
        printPyramid(5);
        printPyramid(50);
    }

    private static void printPyramid(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}

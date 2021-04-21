package nl.capgemini.academy.assignments.week1.for_if.a2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Donald Duck", 41);

        Person person2 = new Person("Huey", 11);

        Person person3 = new Person("Pluto", 4);

        // If we make calculatePrice static, we don't need an instance of Zoo.
        Zoo zoo = new Zoo();

        System.out.println(zoo.calculatePrice(person1));
        System.out.println(zoo.calculatePrice(person2));
        System.out.println(zoo.calculatePrice(person3));
    }
}

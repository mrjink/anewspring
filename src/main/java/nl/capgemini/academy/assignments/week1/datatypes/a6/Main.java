package nl.capgemini.academy.assignments.week1.datatypes.a6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Donald Duck";
        person1.age = 41;
        person1.printIntroduction();

        Person person2 = new Person();
        person2.name = "Huey";
        person2.age = 11;
        person2.printIntroduction();

        Person person3 = new Person();
        person3.name = "Dewey";
        person3.age = 11;
        person3.printIntroduction();

        Person person4 = new Person();
        person4.name = "Louie";
        person4.age = 11;
        person4.printIntroduction();
    }
}

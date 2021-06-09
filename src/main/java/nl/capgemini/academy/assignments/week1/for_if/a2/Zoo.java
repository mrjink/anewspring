package nl.capgemini.academy.assignments.week1.for_if.a2;

public class Zoo {
    // technically, this method could be static, since it doesn't rely on instance variables
    public int calculatePrice(Person person) {
        // Because of the "return" statements, we don't need "else".  After all, once we "return",
        // we can't get to the rest of the code, so "else" doesn't make a difference.

        if (person.getAge() <= 5) {
            return 0;
        }
        if (person.getAge() <= 12) {
            return 5;
        }
        return 15;
    }
}

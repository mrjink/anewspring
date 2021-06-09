package nl.capgemini.academy.assignments.airport.day1;

public class Application {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ABC123", 100, 800);
        Airplane airplane2 = new Airplane("DDD888", 100, 800);

        airplane1.loadPassengers(43);
        airplane1.takeOff();
        airplane2.loadPassengers(23);
        airplane1.land();
        airplane1.unloadPassengers();
        airplane2.takeOff();
        airplane2.land();
        airplane2.unloadPassengers();
    }
}

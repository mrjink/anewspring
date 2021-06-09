package nl.capgemini.academy.assignments.airport.day2;

public class Application {
    public static void main(String[] args) {
        part1();
        part2();
    }

    private static void part1() {
        System.out.println("Exercises part 1");
        Airplane airplane1 = new Airplane("ABC123", 33, 800);
        Airplane airplane2 = new Airplane("DDD888", 33, 800);

        airplane1.loadPassengers(43);
        airplane1.land();
        airplane1.takeOff();
        airplane2.loadPassengers(23);
        airplane2.takeOff();
        airplane1.land();
        airplane1.unloadPassengers();
        airplane2.takeOff();
        airplane2.land();
        airplane2.unloadPassengers();
    }

    private static void part2() {
        System.out.println("Exercises part 2");
        Airplane airplane1 = new Airplane("ABC123", 30, 800);
        Airplane airplane2 = new Airplane("DDD888", 30, 800);
        Airplane airplane3 = new Airplane("ODL345", 30, 800);
        Airport airport = new Airport("Eindhoven", new Airplane[]{airplane1, airplane2, airplane3});
        airport.printAirplanes();
        Airplane airplane = airport.requestAirplane();
        airplane.loadPassengers(63);
    }
}

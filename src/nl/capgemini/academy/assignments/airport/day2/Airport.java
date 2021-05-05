package nl.capgemini.academy.assignments.airport.day2;

public class Airport {
    private String name;
    private Airplane[] airplanes;

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    public void printAirplanes() {
        System.out.format("Aircraft from airport %s:%n", name);
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }

    public Airplane requestAirplane() {
        for (Airplane airplane : airplanes) {
            if (!airplane.isFlying() && airplane.remainingSeats() > 0) {
                System.out.format("%s requested. Is not flying, still room for %d passengers.%n", airplane, airplane.remainingSeats());
                return airplane;
            }
        }
        System.out.println("No available airplane found.");
        return null;
    }
}

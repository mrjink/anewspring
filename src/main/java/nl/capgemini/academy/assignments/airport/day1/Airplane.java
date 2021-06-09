package nl.capgemini.academy.assignments.airport.day1;

public class Airplane {
    private String identification;
    private int maxPassengers;
    private int currentPassengers;
    private boolean flying;
    private int cruiseSpeed;

    public Airplane(String identification, int maxPassengers, int cruiseSpeed) {
        this.identification = identification;
        this.maxPassengers = maxPassengers;
        this.cruiseSpeed = cruiseSpeed;
        this.currentPassengers = 0;
        this.flying = false;
    }

    public void loadPassengers(int passengers) {
        System.out.format("Airplane %s loads %d passengers.%n", identification, passengers);
        currentPassengers += passengers;
    }

    public int unloadPassengers() {
        System.out.format("Airplane %s unloads %d passengers.%n", identification, currentPassengers);
        int passengers = currentPassengers;
        currentPassengers = 0;
        return passengers;
    }

    public void takeOff() {
        System.out.format("Airplane %s takes off.%n", identification);
        flying = true;
    }

    public void land() {
        System.out.format("Airplane %s lands.%n", identification);
        flying = false;
    }
}

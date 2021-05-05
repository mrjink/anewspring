package nl.capgemini.academy.assignments.airport.day2;

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
        if (currentPassengers + passengers > maxPassengers) {
            System.out.format("Airplane %s charges %d passengers, %d do not fit.%n", identification, passengers, passengers - (maxPassengers - currentPassengers));
            currentPassengers = maxPassengers;
        } else {
            System.out.format("Airplane %s charges %d passengers.%n", identification, passengers);
            currentPassengers += passengers;
        }
    }

    public int unloadPassengers() {
        System.out.format("Airplane %s unloads %d passengers.%n", identification, currentPassengers);
        int passengers = currentPassengers;
        currentPassengers = 0;
        return passengers;
    }

    public void takeOff() {
        if (flying) {
            System.out.format("Airplane %s can not take off, because we are already flying.%n", identification);
        } else {
            System.out.format("Airplane %s rises.%n", identification);
            flying = true;
        }
    }

    public void land() {
        if (!flying) {
            System.out.format("Airplane %s can not land, because we are still on the ground.%n", identification);
        } else {
            System.out.format("Airplane %s lands.%n", identification);
            flying = false;
        }
    }

    @Override
    public String toString() {
        return "Airplane " + identification;
    }

    public boolean isFlying() {
        return flying;
    }

    public int remainingSeats() {
        return maxPassengers - currentPassengers;
    }
}

package nl.capgemini.academy.assignments.airport.day5;

public final class PeoplePlane extends AbstractAirplane implements JetEngine {
    private final int maxPassengers;
    private int currentPassengers;

    public PeoplePlane(String identification, int maxPassengers, int cruiseSpeed) {
        super(identification, cruiseSpeed);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;
    }

    public void loadPassengers(int passengers) {
        if (currentPassengers + passengers > maxPassengers) {
            System.out.format("%s charges %d passengers, %d do not fit.%n", this, passengers, passengers - (maxPassengers - currentPassengers));
            currentPassengers = maxPassengers;
        } else {
            System.out.format("%s charges %d passengers.%n", this, passengers);
            currentPassengers += passengers;
        }
    }

    public int unloadPassengers() {
        if (isFlying()) {
            System.out.println("Can't unload passengers while flying!");
            return 0;
        } else {
            System.out.format("%s unloads %d passengers.%n", this, currentPassengers);
            int passengers = currentPassengers;
            currentPassengers = 0;
            return passengers;
        }
    }

    public int remainingSeats() {
        return maxPassengers - currentPassengers;
    }

    @Override
    public String toString() {
        return "Passenger plane " + identification;
    }

    @Override
    public void startStarterEngine() {
        System.out.println("Starting starter engine.");
    }
}

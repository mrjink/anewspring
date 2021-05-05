package nl.capgemini.academy.assignments.airport.day3;

public class PeoplePlane extends Airplane {
    private int maxPassengers;
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
        System.out.format("%s unloads %d passengers.%n", this, currentPassengers);
        int passengers = currentPassengers;
        currentPassengers = 0;
        return passengers;
    }

    public int remainingSeats() {
        return maxPassengers - currentPassengers;
    }

    @Override
    public String toString() {
        return "Passenger plane " + identification;
    }


}

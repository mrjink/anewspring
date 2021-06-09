package nl.capgemini.academy.assignments.airport.day3;

public class Airport {
    private String name;
    private PeoplePlane[] peoplePlanes;
    private CargoPlane[] cargoPlanes;

    public Airport(String name, PeoplePlane[] peoplePlanes, CargoPlane[] cargoPlanes) {
        this.name = name;
        this.peoplePlanes = peoplePlanes;
        this.cargoPlanes = cargoPlanes;
    }

    public void printPeoplePlanes() {
        System.out.format("Passenger planes from airport %s:%n", name);
        for (PeoplePlane peoplePlane : peoplePlanes) {
            System.out.println(peoplePlane);
        }
    }

    public void printCargoPlanes() {
        System.out.format("Cargo planes from airport %s:%n", name);
        for (CargoPlane cargoPlane : cargoPlanes) {
            System.out.println(cargoPlane);
        }
    }

    public PeoplePlane requestPeoplePlane() {
        for (PeoplePlane peoplePlane : peoplePlanes) {
            if (!peoplePlane.isFlying() && peoplePlane.remainingSeats() > 0) {
                System.out.format("%s requested. Is not flying, still room for %d passengers.%n", peoplePlane, peoplePlane.remainingSeats());
                return peoplePlane;
            }
        }
        System.out.println("No available airplane found.");
        return null;
    }

    public CargoPlane requestCargoPlane() {
        for(CargoPlane cargoPlane: cargoPlanes) {
            if (!cargoPlane.isFlying() && cargoPlane.availableSpace() > 0) {
                System.out.format("%s requested. Is not flying, still room for %d tons of freight.%n", cargoPlane, cargoPlane.availableSpace());
                return cargoPlane;
            }
        }
        System.out.println("No available airplane found.");
        return null;
    }

}

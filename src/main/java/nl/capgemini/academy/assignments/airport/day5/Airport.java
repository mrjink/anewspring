package nl.capgemini.academy.assignments.airport.day5;

public class Airport {
    private String name;
    private Airplane[] airplanes;

    public Airport(String name, Airplane[] airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

/*
    private <E extends Airplane> List<E> getAirplanes(Class<E> clazz) {
        List<E> result = new ArrayList<>();
        for (Airplane airplane : airplanes) {
            if (clazz.isAssignableFrom(airplane.getClass())) {
                result.add((E) airplane);
            }
        }
        return result;
    }
*/

    public void printPeoplePlanes() {
        System.out.format("Passenger planes from airport %s:%n", name);
/*
        for (PeoplePlane peoplePlane : getAirplanes(PeoplePlane.class)) {
            System.out.println(peoplePlane);
        }
*/
                for (Airplane airplane : airplanes) {
                    if (airplane instanceof PeoplePlane) {
                        System.out.println(airplane);
                    }
                }
    }

    public void printCargoPlanes() {
        System.out.format("Cargo planes from airport %s:%n", name);
/*
        for (CargoPlane cargoPlane : getAirplanes(CargoPlane.class)) {
            System.out.println(cargoPlane);
        }
*/
        for (Airplane airplane : airplanes) {
            if (airplane instanceof CargoPlane) {
                System.out.println(airplane);
            }
        }
    }

    public PeoplePlane requestPeoplePlane() {
        for (Airplane airplane : airplanes) {
            if (!airplane.isFlying() && airplane instanceof PeoplePlane) {
                PeoplePlane peoplePlane = (PeoplePlane) airplane;
                if (peoplePlane.remainingSeats() > 0) {
                    System.out.format("%s requested. Is not flying, still room for %d passengers.%n", peoplePlane, peoplePlane.remainingSeats());
                    return peoplePlane;
                }
            }
        }
        System.out.println("No available airplane found.");
        return null;
    }

    public CargoPlane requestCargoPlane() {
        for (Airplane airplane : airplanes) {
            if (!airplane.isFlying() && airplane instanceof CargoPlane) {
                CargoPlane cargoPlane = (CargoPlane) airplane;
                if (cargoPlane.availableSpace() > 0) {
                    System.out.format("%s requested. Is not flying, still room for %d tons of freight.%n", cargoPlane, cargoPlane.availableSpace());
                    return cargoPlane;
                }
            }
        }
        System.out.println("No available airplane found.");
        return null;
    }

}

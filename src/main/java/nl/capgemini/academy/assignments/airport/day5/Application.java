package nl.capgemini.academy.assignments.airport.day5;

public class Application {
    public static void main(String[] args) {
        PeoplePlane peoplePlane1 = new PeoplePlane("ABC123", 30, 800);
        PeoplePlane peoplePlane2 = new PeoplePlane("DDD888", 30, 800);
        PeoplePlane peoplePlane3 = new PeoplePlane("ODL345", 30, 800);
        CargoPlane cargoPlane1 = new CargoPlane("FF2134", 15, 800);
        CargoPlane cargoPlane2 = new CargoPlane("PLA166", 15, 800);

        Airport airport = new Airport("Eindhoven", new Airplane[]{peoplePlane1, peoplePlane2, peoplePlane3, cargoPlane1, cargoPlane2});
        airport.printPeoplePlanes();
        System.out.println();

        airport.printCargoPlanes();
        System.out.println();

        PeoplePlane peoplePlane = airport.requestPeoplePlane();
        peoplePlane.loadPassengers(63);
        peoplePlane.startStarterEngine();
        peoplePlane.takeOff();
        peoplePlane.land();
        peoplePlane.unloadPassengers();
        System.out.println();

        CargoPlane cargoPlane = airport.requestCargoPlane();
        cargoPlane.loadFreight(20);
        cargoPlane.tightenPropellers();
        cargoPlane.takeOff();
        cargoPlane.land();
        cargoPlane.unloadFreight();
        System.out.println();

        SpacePlane spacePlane = new SpacePlane("SPC001", 10000);
        spacePlane.startStarterEngine();
        spacePlane.takeOff();
        spacePlane.flyOnMissiles();
        spacePlane.land();
    }

}

package nl.capgemini.academy.assignments.airport.day5;

public class SpacePlane extends AbstractAirplane implements JetEngine, Missiles {
    protected SpacePlane(String identification, int cruiseSpeed) {
        super(identification, cruiseSpeed);
    }

    @Override
    public void startStarterEngine() {
        System.out.println("Starting starter engine");
    }

    @Override
    public void flyOnMissiles() {
        System.out.println("Flying on missiles.");
    }

    @Override
    public String toString() {
        return "Spacecraft " + identification;
    }
}

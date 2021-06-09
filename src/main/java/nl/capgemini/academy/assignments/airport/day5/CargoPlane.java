package nl.capgemini.academy.assignments.airport.day5;

public final class CargoPlane extends AbstractAirplane implements PropellerEngine {
    private final int maxFreight;
    private int currentFreight;

    public CargoPlane(String identification, int maxFreight, int cruiseSpeed) {
        super(identification, cruiseSpeed);
        this.maxFreight = maxFreight;
        this.currentFreight = 0;
    }

    public void loadFreight(int freight) {
        if (currentFreight + freight > maxFreight) {
            System.out.format("%s loads %d tons of freight, %d tons do not fit.%n", this, freight, freight - (maxFreight - currentFreight));
            currentFreight = maxFreight;
        } else {
            System.out.format("%s loads %d tons of freight.%n", this, freight);
            currentFreight += freight;
        }
    }

    public int unloadFreight() {
        if (isFlying()) {
            System.out.println("Can't unload freight while flying!");
            return 0;
        } else {
            System.out.format("%s unloads %d tons of freight.%n", this, currentFreight);
            int freight = currentFreight;
            currentFreight = 0;
            return freight;
        }
    }

    public int availableSpace() {
        return maxFreight - currentFreight;
    }

    @Override
    public String toString() {
        return "Cargo plane " + identification;
    }

    @Override
    public void tightenPropellers() {
        System.out.println("Tightening propellers.");
    }
}

package nl.capgemini.academy.assignments.airport.day5;

public abstract class AbstractAirplane implements Airplane {
    protected String identification;
    private boolean flying;
    private int cruiseSpeed;

    protected AbstractAirplane(String identification, int cruiseSpeed) {
        this.identification = identification;
        this.cruiseSpeed = cruiseSpeed;
        this.flying = false;
    }

    @Override
    public final void takeOff() {
        if (flying) {
            System.out.format("%s can not take off, because we are already flying.%n", this);
        } else {
            System.out.format("%s rises.%n", this);
            flying = true;
        }
    }

    @Override
    public final void land() {
        if (!flying) {
            System.out.format("%s can not land, because we are still on the ground.%n", this);
        } else {
            System.out.format("%s lands.%n", this);
            flying = false;
        }
    }

    @Override
    public final boolean isFlying() {
        return flying;
    }

    @Override
    public String getIdentification() {
        return identification;
    }
}

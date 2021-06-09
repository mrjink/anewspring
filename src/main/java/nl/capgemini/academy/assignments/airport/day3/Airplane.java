package nl.capgemini.academy.assignments.airport.day3;

public abstract class Airplane {
    protected String identification;
    private boolean flying;
    private int cruiseSpeed;

    public Airplane(String identification, int cruiseSpeed) {
        this.identification = identification;
        this.cruiseSpeed = cruiseSpeed;
        this.flying = false;
    }

    public void takeOff() {
        if (flying) {
            System.out.format("%s can not take off, because we are already flying.%n", this);
        } else {
            System.out.format("%s rises.%n", this);
            flying = true;
        }
    }

    public void land() {
        if (!flying) {
            System.out.format("%s can not land, because we are still on the ground.%n", this);
        } else {
            System.out.format("%s lands.%n", this);
            flying = false;
        }
    }

    public boolean isFlying() {
        return flying;
    }

}

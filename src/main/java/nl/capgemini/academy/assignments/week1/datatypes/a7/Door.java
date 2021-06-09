package nl.capgemini.academy.assignments.week1.datatypes.a7;

public class Door {
     int width;
     int height;
     boolean open;

    public void openDoor() {
            open = true;
    }

    public void closeDoor() {
            open = false;
    }

    public int calculateSurface() {
        return width * height;
    }

    public void printOpen() {
        System.out.println("The door is open: " + open);
    }
}

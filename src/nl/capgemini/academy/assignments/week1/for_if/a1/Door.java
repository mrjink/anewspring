package nl.capgemini.academy.assignments.week1.for_if.a1;

public class Door {
    private final int width;
    private final int height;
    private boolean open;

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void openDoor() {
        if (open) {
            System.out.println("Door is already open");
        } else {
            System.out.println("Opening door");
            open = true;
        }
    }

    public void closeDoor() {
        if (!open) {
            System.out.println("Door is already closed");
        } else {
            System.out.println("Closing door");
            open = false;
        }
    }

    public int calculateSurface() {
        return width * height;
    }

    public void printOpen() {
        if (open) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }

        // ternary operator.  shorter, but is this easy to read?
        /*
        System.out.println("The door is " + (open ? "open" : "closed"));
         */
    }
}

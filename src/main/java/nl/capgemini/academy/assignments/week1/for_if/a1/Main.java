package nl.capgemini.academy.assignments.week1.for_if.a1;

public class Main {
    public static void main(String[] args) {
        Door door = new Door(10, 20);

        door.openDoor();
        door.printOpen();

        door.closeDoor();
        door.printOpen();

        door.openDoor();
        door.openDoor();

        door.closeDoor();
        door.closeDoor();

        System.out.println(door.calculateSurface());
    }
}

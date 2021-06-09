package nl.capgemini.academy.assignments.week1.datatypes.a7;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        door.width = 10;
        door.height = 20;

        door.openDoor();
        door.printOpen();

        door.closeDoor();
        door.printOpen();

        System.out.println(door.calculateSurface());
    }
}

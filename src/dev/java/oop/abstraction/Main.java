package dev.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(200);
        aircraftWing.open();

        Robocop robocop = new Robocop();
        robocop.setName("robo");
        robocop.setWing(aircraftWing);


//        robocop.flight();
//        robocop.talk();
//        robocop.move();

        robocop.off();

        //abstract class may inherit from abstract or public class
        //implement other interfaces
        // be parent for child classes
    }
}
package dev.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Robocop robocop = new Robocop("robocop");
        robocop.flight();
        robocop.talk();

        //abstract class may inherit from abstract or public class
        //implement other interfaces
        // be parent for child classes
    }
}
package dev.java.oop.abstraction;

// you can describe all method actions and fields in interfaces
public interface IRobot{
    // four business methods
    default void move(){
        // zaglushka if it is commented in Robocop
        // if Robocop uncommented, Robo's move works
        System.out.println("default move " + getName());
    }
    void stop();
    void flight();
    void talk();

    // two method-fields
    String getName();
    // setter methods is not necessary
    IWing getWing(); // all robots have wings and they cannot flight

}

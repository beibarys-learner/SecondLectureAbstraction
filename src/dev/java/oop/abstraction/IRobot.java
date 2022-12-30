package dev.java.oop.abstraction;

// you can describe all method actions and fields in interfaces
public interface IRobot{
    // four business methods
    default void move(){
        System.out.println("move" + getName());
    }
    void stop();
    void flight();
    void talk();

    // two method-fields
    String getName();
    // setter methods is not necessary
    IWing getWing(); // all robots have wings and they cannot flight

}

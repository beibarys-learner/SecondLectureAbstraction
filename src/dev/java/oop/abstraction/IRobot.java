package dev.java.oop.abstraction;

// you can describe all method actions and fields in interfaces
public interface IRobot extends ITechnic{
    void move();
    void stop();
    void flight();
    void talk();

    // method-fields
    String getName();
    // setter methods is not necessary
    IWing getWing(); // all robots have wings and they cannot flight

}

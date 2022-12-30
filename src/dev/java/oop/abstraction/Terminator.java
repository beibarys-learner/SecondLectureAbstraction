package dev.java.oop.abstraction;

public class Terminator implements IRobot{
    @Override
    public void move() {
        System.out.println("T move");
    }

    @Override
    public void stop() {
        System.out.println("T stop");
    }
    @Override
    public void flight() {
        System.out.println("T flight");
    }
}

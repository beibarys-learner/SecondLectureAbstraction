package dev.java.oop.abstraction;

public abstract class Terminator extends ARobot{
    // current class not must to implement getName, since it is already described at ARobot

    public Terminator() {
    }

    public Terminator(String name, Wing wing) {
        super(name, wing);
    }

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

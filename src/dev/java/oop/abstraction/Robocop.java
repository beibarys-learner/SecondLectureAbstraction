package dev.java.oop.abstraction;

public class Robocop implements IRobot{
    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void flight() {
        System.out.println("flight");
    }

}

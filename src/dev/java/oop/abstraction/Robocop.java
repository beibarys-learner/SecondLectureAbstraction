package dev.java.oop.abstraction;

public class Robocop implements IRobot{
    @Override
    public void move() {
        System.out.println("Robocop move");
    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void flight() {
        System.out.println("Robocop flight");
    }

}

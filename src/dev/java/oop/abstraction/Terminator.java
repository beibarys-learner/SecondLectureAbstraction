package dev.java.oop.abstraction;

public class Terminator implements IRobot{

    private String name;
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

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

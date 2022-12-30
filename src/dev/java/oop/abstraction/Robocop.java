package dev.java.oop.abstraction;

public class Robocop extends ARobot {
    public Robocop() {
    }

    public Robocop(String name, IWing wing) {
        super(name, wing);
    }

//    @Override
//    public void move() {
//        System.out.println("Robocop move");
//    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void flight() {
        System.out.println("Robocop flight with size = " + getWing().getSize());
    }

    public void talk() {
        System.out.println("Robocop talk");
    }

}

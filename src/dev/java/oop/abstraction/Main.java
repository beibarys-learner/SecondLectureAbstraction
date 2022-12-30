package dev.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Robocop robocop = new Robocop();
        robocop.flight();
        Terminator terminator = new Terminator();
        terminator.move();
        System.out.println("Hello world!");
    }
}
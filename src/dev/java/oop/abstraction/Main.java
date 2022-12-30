package dev.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Robocop robocop = new Robocop();
        robocop.setName("robo");
        robocop.flight();
        System.out.println("robocop.getName(\"asdsa\") = " + robocop.getName());
    }
}
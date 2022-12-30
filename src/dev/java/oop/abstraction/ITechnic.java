package dev.java.oop.abstraction;

public interface ITechnic {
    default void on(){
        System.out.println("default on");
    };
    default void off(){
        System.out.println("default off");
        on();
    };
}

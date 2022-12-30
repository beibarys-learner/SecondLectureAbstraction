package dev.java.oop.abstraction;

public class AircraftWing implements Wing {
    private int size;
    @Override
    public void open() {
        System.out.println("wing open");
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

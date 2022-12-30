package dev.java.oop.abstraction;

public abstract class ARobot implements IRobot{
    private String name;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

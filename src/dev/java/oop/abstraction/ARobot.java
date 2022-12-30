package dev.java.oop.abstraction;

public abstract class ARobot implements IRobot{
    public ARobot() {
    }

    public ARobot(String name, Wing wing) {
        this.name = name;
        this.wing = wing;
    }

    private String name;
    private Wing wing;

    @Override
    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void talk();


}

package dev.java.oop.abstraction;

public abstract class ARobot implements IRobot{
    public ARobot() {
    }

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    private String name;
    private IWing wing;

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
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

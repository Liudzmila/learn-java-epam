package main.java.com.epam.learn.designpatterns.creational.prototype;

public abstract class Graphic {

    private int heightInPixels;

    public Graphic(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public abstract Graphic clone();

    @Override
    public String toString() {
        return "heightInPixels=" +
                "'" + heightInPixels +
                "'";
    }
}

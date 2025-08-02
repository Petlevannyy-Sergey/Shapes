package model;

public abstract class Shape implements Drawable {
    protected String name;
    protected String colour;

    public abstract double getPerimeter();

    public abstract double getSquare();

    public abstract void draw();

    public Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}

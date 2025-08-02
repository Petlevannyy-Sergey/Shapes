package model;

public class Circle extends Shape {
    private final double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем %s %s %.2f\n", colour, name, radius);
    }
}

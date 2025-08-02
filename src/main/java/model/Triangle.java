package model;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(String name, String colour, double a, double b, double c) {
        super(name, colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем %s %s со сторонами %.2f, %.2f, %.2f\n", colour, name, a, b, c);
    }
}

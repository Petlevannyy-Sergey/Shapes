package model;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String name, String colour, double height, double width) {
        super(name, colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем %s %s со сторонами %.2f и %.2f\n", colour, name, width, height);
    }
}

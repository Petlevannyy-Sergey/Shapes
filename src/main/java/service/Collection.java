package service;

import model.Rectangle;
import model.Shape;

public class Collection {
    private final Shape[] shapes;

    public Collection(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double getTotalPerimeter() {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.getPerimeter();
        }
        return result;
    }

    public void Draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public double getTotalSquare() {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.getSquare();
        }
        return result;
    }

    public int countShapesByColour(String colour) {
        int result = 0;
        for (Shape shape:shapes){
            if (shape.getColour().equals(colour))             {
                result++;
            }
        }
        return result;
    }

    public int countRectangles() {
        int result = 0;
        for (Shape shape:shapes){
            if (shape instanceof Rectangle)             {
                result++;
            }
        }
        return result;
    }
}
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import model.constants.Colour;
import model.constants.Type;
import service.Collection;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle(Type.CIRCLE, Colour.RED, 10);
        var rectangle = new Rectangle(Type.RECTANGLE, Colour.GREEN, 2, 4);
        var triangle = new Triangle(Type.TRIANGLE, Colour.BLUE, 3, 3, 3);

        Shape[] shapes = {circle, rectangle, triangle};
        var collection = new Collection(shapes);

        collection.Draw();
        System.out.printf("Суммарный периметр всех фигур: %.2f\n", collection.getTotalPerimeter());
        System.out.printf("Суммарная площадь всех фигур: %.2f\n", collection.getTotalSquare());
        System.out.printf("Количество фигур краного цвета: %d\n", collection.countShapesByColour(Colour.RED));
        System.out.printf("Количество прямоугольников: %d\n", collection.countRectangles());
    }
}
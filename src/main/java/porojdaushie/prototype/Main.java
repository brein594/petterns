package porojdaushie.prototype;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of (
                new Square(10), new Circle(10)
        );

        var newShapes = shapes.stream()
                .map(Shape::clone)
                .collect(Collectors.toList());
        System.out.println(shapes);
        System.out.println(newShapes);
    }
}

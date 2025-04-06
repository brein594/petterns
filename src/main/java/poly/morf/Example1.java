package poly.morf;


import java.util.List;

public class Example1 {
    public static void main(String[] args) {
/*
        List<Square> squares = List.of(
                new Square(2),
                new Square(3)
        );
        List<Rectangle> rectangles = List.of(
                new Rectangle(1, 2),
                new Rectangle(1, 3)
        );

 */
        List<Figure> figures = List.of (
                new Square(2),
                new Square(3),
                new Rectangle(1,2),
                new Rectangle(2, 3)
        );
        //System.out.println(getTotalArea(squares, rectangles));
        System.out.println(getTotalArea(figures));
    }

    public static double getTotalArea(List<Figure> figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.getArea();
        }
        return result;
    }
/*
    public static double getTotalArea(List<Square> squares, List<Rectangle> rectangles) {
        double result = 0;
        for (Square square : squares) {
            result += square.getArea();
        }
        for (Rectangle rectangle : rectangles) {
            result += rectangle.getArea();
        }
        return result;
    }

 */

}

package poly.morf;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Figure {
    private int side;

    public double getArea() {
        System.out.println("get square area");
        return side * side;
    }

}

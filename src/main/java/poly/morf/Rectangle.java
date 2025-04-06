package poly.morf;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Figure {
    private int sideA;
    private int sideB;

    public double getArea() {
        System.out.println("get Rectangle area");
        return sideA * sideB;
    }

}

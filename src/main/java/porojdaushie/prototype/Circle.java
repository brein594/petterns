package porojdaushie.prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape{
    private final int radius;

    @Override
    public double gatArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}

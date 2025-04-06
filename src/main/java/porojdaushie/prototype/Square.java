package porojdaushie.prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape{
    private final int a;


    @Override
    public double gatArea() {
        return a * a;
    }

    @Override
    public Shape clone() {
        return new Square(a);
    }
}

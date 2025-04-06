package hexlet.code;
import lombok.Getter;

//@Getter
public class Car {
    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "Car name: " + name + " model: " + model;
    }

}

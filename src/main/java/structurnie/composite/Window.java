package structurnie.composite;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Window implements Component{
    List<Component> childComponents;

    public void draw() {
        System.out.println("drawWindow");
        childComponents.forEach(Component::draw);
    }
}

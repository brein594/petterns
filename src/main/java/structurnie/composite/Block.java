package structurnie.composite;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Block implements Component{
    List<Component> childComponents;

    public void draw() {
        System.out.println("drawBlock");
        childComponents.forEach(Component::draw);
    }
}

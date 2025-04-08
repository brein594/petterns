package structurnie.decorator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order =new BaseOrder(List.of(100, 500, 100));
        order = new DeliveryOrder(order);
        order = new InsOrder(order);

        System.out.println(order.getTotalPrice());
    }
}

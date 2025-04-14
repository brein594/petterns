package structurnie.strategy;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(1000);
        StrategySelector selector = new StrategySelector();
        DiscountStrategy discountStrategy = selector.getDiscountStrategy(cart);
        System.out.println(discountStrategy.applyDiscount(cart));

        var cart1 = new Cart(1001);
        var selector1 = new StrategySelector();
        DiscountStrategy discountStrategy1 = selector1.getDiscountStrategy(cart1);
        System.out.println(discountStrategy1.applyDiscount(cart1));
    }
}

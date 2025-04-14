package structurnie.strategy;

public class DefaultStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(Cart cart) {
        return false;
    }

    @Override
    public int applyDiscount(Cart cart) {
        return cart.getAmount();
    }
}

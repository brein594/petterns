package structurnie.strategy;

public class BigAmountStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(Cart cart) {
        return cart.getAmount() >1000;
    }

    @Override
    public int applyDiscount(Cart cart) {
        return (int) (cart.getAmount() * 0.95);
    }
}

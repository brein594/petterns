package structurnie.strategy;

public interface DiscountStrategy {
    boolean isApplicable(Cart cart);
    int applyDiscount(Cart cart);
}

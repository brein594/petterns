package structurnie.strategy;

import java.time.LocalDate;

public class NewYearStrategy implements DiscountStrategy {
    @Override
    public boolean isApplicable(Cart cart) {
        return LocalDate.now().getDayOfYear() < 200;
    }

    @Override
    public int applyDiscount(Cart cart) {
        return (int) (cart.getAmount() * 0.90);
    }
}

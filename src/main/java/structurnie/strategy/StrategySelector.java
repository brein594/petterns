package structurnie.strategy;

import java.util.List;

public class StrategySelector {
    private final List<DiscountStrategy> discountStrategies =List.of(
            new NewYearStrategy(),
            new BigAmountStrategy()
            );

    private final DiscountStrategy defaultStategy = new DefaultStrategy();

    public DiscountStrategy getDiscountStrategy (Cart cart) {
        return discountStrategies.stream()
                .filter(s -> s.isApplicable(cart))
                .findFirst()
                .orElse(defaultStategy);
    }
}

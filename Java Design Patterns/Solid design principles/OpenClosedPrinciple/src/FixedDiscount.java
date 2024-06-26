// Class implementing fixed discount strategy
public class FixedDiscount implements DiscountStrategy {
    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - discountAmount;
    }
}
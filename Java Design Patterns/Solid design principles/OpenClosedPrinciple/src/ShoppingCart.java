import java.util.List;

// Class for calculating total cost of shopping cart
public class ShoppingCart {
    private List<CartItem> items;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(List<CartItem> items, DiscountStrategy discountStrategy) {
        this.items = items;
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double totalPrice = items.stream().mapToDouble(CartItem::getPrice).sum();
        return discountStrategy.applyDiscount(totalPrice);
    }
}
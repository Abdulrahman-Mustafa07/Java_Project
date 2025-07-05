import java.util.*;

public class CheckOut {
    public static void process(Customer customer, Cart cart) {
        if (cart.isEmpty()) throw new RuntimeException("Cart is empty.");
        
        List<ship> toShip = new ArrayList<>();
        Map<String, Integer> counts = new HashMap<>();
        double subtotal = 0;
        
        for (Map.Entry<Product, Integer> mp : cart.getItems().entrySet()) {
            Product product = mp.getKey();
            int quantity = mp.getValue();
            if (product.isExpired()) {
                throw new RuntimeException("Product " + product.getName() + " is expired.");
            }

            if (quantity > product.getQuantity()) {
                throw new RuntimeException("Not enough quantity for " + product.getName());
            }
            
            product.decreaseQuantity(quantity);
            double price = quantity * product.getPrice();
            subtotal += price;
            
            if (product instanceof ship) {
                toShip.add((ship) product);
                counts.put(product.getName(), counts.getOrDefault(product.getName(), 0) + quantity);
            }
        }
        
        double shippingFee = 10;
        if (toShip.isEmpty()) shippingFee = 0;
        double total = subtotal + shippingFee;
        customer.deduct(total);
        
        ShippingService.calc(toShip, counts);
        
        System.out.println("** Checkout receipt **");
        
        for (Map.Entry<Product, Integer> mp : cart.getItems().entrySet()) {
            Product product = mp.getKey();
            int quantity = mp.getValue();
            System.out.printf("%dx %s\t%.0f\n", quantity, product.getName(), product.getPrice() * quantity);
        }
        System.out.println();
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shippingFee);
        System.out.printf("Amount\t\t%.0f\n", total);
        System.out.printf("Customer Balance: %.0f\n", customer.getBalance());
    }
}
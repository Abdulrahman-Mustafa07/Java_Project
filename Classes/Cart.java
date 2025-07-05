import java.util.*;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();
    
    public void add(Product product, int quantity) {
        if(quantity > product.getQuantity()) {
            throw new RuntimeException("There is not enough quantity for" + product.getName());
        }
        else {
            items.put(product, items.getOrDefault(product, 0) + quantity);
        }
    }
    
    public Map<Product, Integer> getItems() {
        return items;
    }
    
    public void clear() {
        items.clear();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
}

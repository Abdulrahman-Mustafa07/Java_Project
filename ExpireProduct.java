import java.time.LocalDate;

public class ExpireProduct extends Product {
    protected LocalDate expiryDate;
    
    public ExpireProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }
    
    public boolean isExpired () {
        return LocalDate.now().isAfter(expiryDate);
    }
}
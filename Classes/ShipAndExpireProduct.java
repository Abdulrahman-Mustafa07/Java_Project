import java.time.LocalDate;

public class ShipAndExpireProduct extends ExpireProduct implements ship {
    private double weight;
    public ShipAndExpireProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}

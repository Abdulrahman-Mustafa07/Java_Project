public class ShipAndNonExpireProduct extends NonExpireProduct implements ship {
    private double weight;
    public ShipAndNonExpireProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
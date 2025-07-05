import java.time.LocalDate;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Customer customer = new Customer("Ali", 500);

                Product cheese = new ShipAndExpireProduct("Cheese", 100, 5, LocalDate.of(2025, 8, 1), 0.2);
                Product biscuits = new ShipAndExpireProduct("Biscuits", 150, 2, LocalDate.of(2025, 8, 1), 0.7);
                Product scratchCard = new NonExpireProduct("Scratch Card", 50, 10);

                Cart cart = new Cart();
                cart.add(cheese, 2);
                cart.add(biscuits, 1);
                cart.add(scratchCard, 1);

                CheckOut.process(customer, cart);
	}
}

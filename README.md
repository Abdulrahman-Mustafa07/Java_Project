# Fawry Rise Journey – E-Commerce System

This repository contains my solution to the **Fawry Full Stack Development Internship Challenge**. The project simulates a simplified e-commerce checkout system with support for product types, shipping, expiry, and payment logic.

# Exapmle Usage

Cart cart = new Cart();

cart.add(cheese, 2);

cart.add(biscuits, 1);

cart.add(scratchCard, 1);

CheckOut.process(customer, cart);

# Output

** Shipment notice **
2x Cheese       400g
1x Biscuits     700g
Total Weight : 1.1kg

** Checkout receipt **
2x Cheese       200
1x Scratch Card 50
1x Biscuits     150

Subtotal        400
Shipping        10
Amount          410
Customer Balance: 90

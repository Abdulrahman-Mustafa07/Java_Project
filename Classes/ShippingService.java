import java.util.*;

public class ShippingService {
    public static void calc(List<ship> items, Map<String, Integer> counts) {
        
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        
        for (ship item : items) {
            int count = counts.getOrDefault(item.getName(), 0);
            double weight = item.getWeight() * count;
            System.out.printf("%dx %s\t%.0fg\n", count, item.getName(), weight * 1000);
            totalWeight += weight;
        }
        
        System.out.printf("Total Weight : %.1fkg\n\n", totalWeight);
    }
}

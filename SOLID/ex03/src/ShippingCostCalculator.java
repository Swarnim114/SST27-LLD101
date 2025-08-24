import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator {
    private Map<String, ShipmentObject> strategies;

    public ShippingCostCalculator() {
        strategies = new HashMap<>();
        strategies.put("STANDARD", new StandardShipmentObject(50, 5));
        strategies.put("EXPRESS", new ExpressShipmentObject(80, 8));
        strategies.put("OVERNIGHT", new OvernightShipmentObject(120, 10));
    }

    public ShippingCostCalculator(Map<String, ShipmentObject> strategies) {
        this.strategies = strategies;
    }

    double cost(Shipment s) {
        ShipmentObject strategy = strategies.get(s.type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown type: " + s.type);
        }
        return strategy.cost(s.weightKg);
    }
} 

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, PaymentStrategy> strategies;

    public PaymentService() {
        strategies = new HashMap<>();
        strategies.put("CARD", new CardPaymentStrategy());
        strategies.put("UPI", new UpiPaymentStrategy());
        strategies.put("WALLET", new WalletPaymentStrategy());
    }

    public PaymentService(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    String pay(Payment p) {
        PaymentStrategy strategy = strategies.get(p.provider);
        if (strategy == null) {
            throw new RuntimeException("No provider: " + p.provider);
        }
        return strategy.pay(p);
    }
}
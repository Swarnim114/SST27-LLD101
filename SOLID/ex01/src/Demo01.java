

public class Demo01 {
    public static void main(String[] args) {
       Notifier noti = new EmailNotifier();
       TaxCalculator tc = new DefaultTaxCalculator(0.18);
       OrderRepository repo = new InMemoryOrderRepository();

       OrderService os = new OrderService(tc, noti, repo);
       os.checkout("a@shop.com", 100.0);
    }
}

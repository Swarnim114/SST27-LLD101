public class InMemoryOrderRepository implements OrderRepository {
    @Override
    public void save(String id){
        System.out.println("Order stored (pretend DB).");
    }
}
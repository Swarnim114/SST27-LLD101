

public class Demo04 {
    public static void main(String[] args) {
        // Using default constructor
        PaymentService service1 = new PaymentService();
        System.out.println(service1.pay(new Payment("UPI", 499)));
        
        
    }
}

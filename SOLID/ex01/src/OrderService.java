public class OrderService {
    TaxCalculator tc ; 
    Notifier noti; 
    OrderRepository repo ;

    public OrderService( TaxCalculator tc , Notifier noti , OrderRepository repo){
        this.tc = tc ;
        this.noti = noti ; 
        this.repo = repo ; 
    }
  
    void checkout(String customerEmail, double subtotal) {
        double total = tc.totalWithTax(subtotal);
        noti.send(customerEmail, "Thanks! Your total is " + total);
        repo.save("1");
    }
}

// here many things are happening which is voiolationg the SRP 
// 1 . tax calculation 
// 2 . notify through email 
// 3 . storing in DB 
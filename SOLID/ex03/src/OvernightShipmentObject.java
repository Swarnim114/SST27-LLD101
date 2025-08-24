public class OvernightShipmentObject implements ShipmentObject {
    
  double start = 120 ; 
    double perKgValue = 10;


    public OvernightShipmentObject(double start , double perKgValue){
        this.start = start ; 
        this.perKgValue = perKgValue;
    }
    @Override
    public double cost (double weight){
        return perKgValue*weight + start;
    }
}
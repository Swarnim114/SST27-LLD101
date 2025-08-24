public class ExpressShipmentObject implements ShipmentObject {
    double start = 80 ; 
    double perKgValue = 8;


    public ExpressShipmentObject(double start , double perKgValue){
        this.start = start ; 
        this.perKgValue = perKgValue;
    }
    @Override
    public double cost (double weight){
        return perKgValue*weight + start;
    }
}
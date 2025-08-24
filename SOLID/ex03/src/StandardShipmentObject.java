public class StandardShipmentObject implements ShipmentObject {
    double start = 50 ; 
    double perKgValue = 5;


    public StandardShipmentObject(double start , double perKgValue){
        this.start = start ; 
        this.perKgValue = perKgValue;
    }
    @Override
    public double cost (double weight){
        return perKgValue*weight + start;
    }
}
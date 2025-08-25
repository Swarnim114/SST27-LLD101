public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
    
    @Override
    public void pedal(int effort) {
        System.out.println("Car doesn't have pedals");
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Regular car doesn't support charging");
    }
}

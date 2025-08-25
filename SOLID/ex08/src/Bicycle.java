public class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving by pedaling");
    }
    
    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
    
    @Override
    public void startEngine() {
        System.out.println("Bicycle doesn't have an engine");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Bicycle doesn't have an engine to stop");
    }
    
    @Override
    public void pedal(int effort) {
        System.out.println("Pedaling with effort " + effort);
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Bicycle doesn't need charging");
    }
}
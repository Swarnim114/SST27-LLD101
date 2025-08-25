public class ElectricCar implements Vehicle {
    private int batteryLevel = 100;
    
    @Override
    public void move() {
        System.out.println("Electric car is driving silently");
    }
    
    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }
    
    @Override
    public void startEngine() {
        System.out.println("Electric motor started");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Electric motor stopped");
    }
    
    @Override
    public void pedal(int effort) {
        System.out.println("Electric car doesn't have pedals");
    }
    
    @Override
    public void recharge(int kWh) {
        batteryLevel = Math.min(100, batteryLevel + kWh * 10);
        System.out.println("Charged with " + kWh + " kWh. Battery level: " + batteryLevel + "%");
    }
    
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

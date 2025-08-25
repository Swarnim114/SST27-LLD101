public class Penguin implements Bird, Flappable {
    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    @Override
    public void flap() {
        System.out.println("Penguin flaps wings but can't fly");
    }
} 

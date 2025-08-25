public class FlyingBird implements Bird, Flyable, Flappable {
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying high!");
    }

    @Override
    public void flap() {
        System.out.println("Flap!");
    }
}

public class Aviary {
    public void release(Bird bird) {
        bird.makeSound();
        
        if (bird instanceof Flyable flyable) {
            flyable.fly();
        } else {
            System.out.println("This bird cannot fly, but can walk away");
        }
        
        System.out.println("Released");
    }
}
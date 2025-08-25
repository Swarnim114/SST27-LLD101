public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        // Flying bird can fly
        Bird flyingBird = new FlyingBird();
        aviary.release(flyingBird);
        
        System.out.println("---");
        
        // Penguin cannot fly but is still a valid bird
        Bird penguin = new Penguin();
        aviary.release(penguin);
    }
}

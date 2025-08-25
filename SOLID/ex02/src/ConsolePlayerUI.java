public class ConsolePlayerUI implements PlayerUI {
    @Override
    public void displayPlaying(int bytes) {
        System.out.println("\u25B6 Playing " + bytes + " bytes");
    }
}

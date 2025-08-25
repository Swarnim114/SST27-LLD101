public class Demo02 {
    public static void main(String[] args) {
        Decoder decoder = new VideoDecoder();
        PlayerUI ui = new ConsolePlayerUI();
        FrameCache cache = new InMemoryFrameCache();
        
        Player player = new Player(decoder, ui, cache);
        player.play(new byte[]{1,2,3,4});
    }
}

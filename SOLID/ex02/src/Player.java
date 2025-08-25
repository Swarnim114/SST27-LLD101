public class Player {
    private Decoder decoder;
    private PlayerUI ui;
    private FrameCache cache;
    
    public Player(Decoder decoder, PlayerUI ui, FrameCache cache) {
        this.decoder = decoder;
        this.ui = ui;
        this.cache = cache;
    }
    
    void play(byte[] fileBytes){
        // Use decoder to decode
        Frame frame = decoder.decode(fileBytes);
        
        // Use UI to display
        ui.displayPlaying(fileBytes.length);
        
        // Use cache to store
        cache.cacheFrame(frame);
        System.out.println("Cached last frame? " + cache.hasCache());
    }
}
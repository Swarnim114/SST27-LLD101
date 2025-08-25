public class InMemoryFrameCache implements FrameCache {
    private Frame lastFrame;
    
    @Override
    public void cacheFrame(Frame frame) {
        this.lastFrame = frame;
    }
    
    @Override
    public boolean hasCache() {
        return lastFrame != null;
    }
}

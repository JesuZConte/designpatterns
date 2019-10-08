package adapter.exercise;

public class VlcPlayer implements AdvancedMediaPlayer {

    private String song;

    @Override
    public void loadFilename(String filename) {
        this.song = filename + ".vlc";
    }

    @Override
    public void listen() {
        System.out.println("Listening to " + song);
    }
}

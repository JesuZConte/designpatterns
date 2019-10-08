package adapter.exercise;

public class Mp4Player implements AdvancedMediaPlayer {
    private String song;

    @Override
    public void loadFilename(String filename) {
        this.song = filename + ".mp4";
    }

    @Override
    public void listen() {
        System.out.println("Listening to " + song);
    }
}

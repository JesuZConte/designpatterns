package adapter.exercise;

public class AdvancedMediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.loadFilename(fileName);
            advancedMediaPlayer.listen();
        } else {
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.loadFilename(fileName);
            advancedMediaPlayer.listen();
        }
    }
}

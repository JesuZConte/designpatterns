package adapter.exercise;

public class AdvancedMediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;
    private MediaPlayer audioPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType == null || audioType.isEmpty() || audioType.equalsIgnoreCase("mp3")) {
            audioPlayer = new AudioPlayer();
            audioPlayer.play(audioType, fileName);
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.loadFilename(fileName);
            advancedMediaPlayer.listen();
        } else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.loadFilename(fileName);
            advancedMediaPlayer.listen();
        } else {
            System.out.println("Invalid media. " + audioType + " not supported.");
        }
    }
}

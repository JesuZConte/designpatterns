package adapter.exercise;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String filename) {
        if(audioType == null || audioType.isEmpty()) {
            audioType = "mp3";
        }
        System.out.println("Playing: " + filename + "." + audioType);
    }
}

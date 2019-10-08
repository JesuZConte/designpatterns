package adapter.exercise;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AdvancedMediaPlayerAdapter adapter = new AdvancedMediaPlayerAdapter();
        adapter.play("", "This Song");
        adapter.play("mp4", "This Song");
        adapter.play("vlc", "This Song");

    }
}

package adapter.exercise;

import javax.print.attribute.standard.Media;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AdvancedMediaPlayerAdapter adapter = new AdvancedMediaPlayerAdapter();

        adapter.play("mp4", "This Song");
        adapter.play("vlc", "This Song");

    }
}

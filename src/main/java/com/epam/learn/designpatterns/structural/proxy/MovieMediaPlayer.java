package main.java.com.epam.learn.designpatterns.structural.proxy;

public class MovieMediaPlayer implements MediaPlayer {

    public MovieMediaPlayer() {
        loadVideo();
    }

    @Override
    public void playMedia() {
        System.out.println("Playing video...");
    }

    // with the proxy you can see it once,
    // because the object of MovieMediaPlayer is initialized once (using proxy)
    private void loadVideo() {
        System.out.println("Loading up large video...");
    }
}

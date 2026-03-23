package main.java.com.epam.learn.designpatterns.structural.proxy;

public class MediaPlayerProxy implements MediaPlayer {

    private MediaPlayer mediaPlayer;


    @Override
    public void playMedia() {
        if (mediaPlayer == null) {
            mediaPlayer = new MovieMediaPlayer();
        }
        mediaPlayer.playMedia();
    }
}

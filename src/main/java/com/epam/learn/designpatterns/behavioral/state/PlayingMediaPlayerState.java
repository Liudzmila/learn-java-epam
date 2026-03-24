package main.java.com.epam.learn.designpatterns.behavioral.state;

public class PlayingMediaPlayerState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new StoppedMediaPlayerState());

    }
}

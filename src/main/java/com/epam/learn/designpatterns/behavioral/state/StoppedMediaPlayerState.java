package main.java.com.epam.learn.designpatterns.behavioral.state;

public class StoppedMediaPlayerState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new PlayingMediaPlayerState());
    }
}

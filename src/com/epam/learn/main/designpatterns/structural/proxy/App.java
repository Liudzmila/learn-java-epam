package com.epam.learn.main.designpatterns.structural.proxy;

public class App {

    private static final MediaPlayerProxy MEDIA_PLAYER_PROXY = new MediaPlayerProxy();

    public static void main(String[] args) {

        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        MEDIA_PLAYER_PROXY.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        MEDIA_PLAYER_PROXY.playMedia();
    }
}

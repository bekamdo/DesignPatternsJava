package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","jsonmusic.mp3");
        AdvancedMediaPlayerInterface mp4Player = new Mp4File();
        MediaPlayerInterface advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter.play();
    }
}

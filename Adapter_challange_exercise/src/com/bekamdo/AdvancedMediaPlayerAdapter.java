package com.bekamdo;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface{
    AdvancedMediaPlayerInterface advanceMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer) {
        advanceMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advanceMusicPlayer.loadFileName(filename);
        advanceMusicPlayer.listen();
    }
}

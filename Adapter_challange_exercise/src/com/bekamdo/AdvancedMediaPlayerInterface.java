package com.bekamdo;

public interface AdvancedMediaPlayerInterface {
    public void loadFileName(String  filename);
    public void listen();
}

class VlcPlayer implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFileName(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc filename . Name " + myFile);
    }
}

class Mp4File implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFileName(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc filename . Name " + myFile);
    }
}
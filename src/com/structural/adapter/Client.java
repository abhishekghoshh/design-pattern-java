package com.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Adapter playerAdapter = null;
        AudioPlayer audioPlayer = null;
        VideoPlayer videoPlayer = null;
        
        audioPlayer= new MP3Player();
        audioPlayer.play("mp3", "jasonsMusic.mp3");
        
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        
        playerAdapter = new PlayerAdapter(new MP3Player());
        playerAdapter.loadFilename("jasonsMusic.mp3");
        playerAdapter.listen();

        videoPlayer = new Mp4Player();
        videoPlayer.loadFilename("alone.mp4");
        videoPlayer.listen();
        
        playerAdapter = new PlayerAdapter(new Mp4Player());
        playerAdapter.play("mp4", "alone.mp4");

        videoPlayer = new VlcPlayer();
        videoPlayer.loadFilename("far far away.vlc");
        videoPlayer.listen();
        
        playerAdapter = new PlayerAdapter(new VlcPlayer());
        playerAdapter.play("vlc", "far far away.vlc");

    }
}

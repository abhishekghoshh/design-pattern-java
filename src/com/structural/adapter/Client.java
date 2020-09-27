package com.structural.adapter;

import com.structural.adapter.audioplayer.MP3Player;
import com.structural.adapter.adapter.PlayerAdapter;
import com.structural.adapter.audioplayer.AudioPlayer;
import com.structural.adapter.videoplayer.VideoPlayer;
import com.structural.adapter.videoplayer.Mp4Player;
import com.structural.adapter.videoplayer.VlcPlayer;


public class Client {

    public static void main(String[] args) {
    	VideoPlayer videoPlayer = null;
        AudioPlayer playerAdapter = null;
        AudioPlayer audioPlayer = null;
        
        audioPlayer= new MP3Player();
        audioPlayer.play("mp3", "jasonsMusic.mp3");

        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        
        videoPlayer = new Mp4Player();
        playerAdapter = new PlayerAdapter(videoPlayer);
        playerAdapter.play("mp4", "alone.mp4");

        videoPlayer = new VlcPlayer();
        playerAdapter = new PlayerAdapter(videoPlayer);
        playerAdapter.play("vlc", "far far away.vlc");

        

    }
}

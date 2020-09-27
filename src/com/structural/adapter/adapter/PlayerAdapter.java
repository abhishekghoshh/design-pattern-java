package com.structural.adapter.adapter;

import com.structural.adapter.audioplayer.AudioPlayer;
import com.structural.adapter.videoplayer.VideoPlayer;

public class PlayerAdapter implements Adapter {
	String className = this.getClass().getSimpleName();
    VideoPlayer videoPlayer;

    public PlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
    	System.out.println("Playing via : "+className);
    	videoPlayer.loadFilename(filename);
    	videoPlayer.listen();
    }

	@Override
	public void loadFilename(String fileName) {
	}

	@Override
	public void listen() {
	}

	@Override
	public void adapt(AudioPlayer audioPlayer) {
	}

	@Override
	public void adapt(VideoPlayer videoPlayer) {
	}
}

package com.structural.adapter;

public class PlayerAdapter implements Adapter {
	String className = this.getClass().getSimpleName();
    VideoPlayer videoPlayer;
    AudioPlayer audioPlayer;
    String fileName;
    String extenstionName;

    public PlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
    public PlayerAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
    	this.videoPlayer.loadFilename(fileName);
    	this.videoPlayer.listen();
    }

	@Override
	public void loadFilename(String fileName) {
		this.fileName=fileName;
		this.extenstionName="mp3";
	}

	@Override
	public void listen() {
		audioPlayer.play(extenstionName,fileName);
	}

	@Override
	public void adapt(AudioPlayer audioPlayer) {
		this.audioPlayer=audioPlayer;
	}

	@Override
	public void adapt(VideoPlayer videoPlayer) {
		this.videoPlayer=videoPlayer;
	}
}

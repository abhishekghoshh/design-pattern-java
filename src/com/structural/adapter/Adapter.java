package com.structural.adapter;

public interface Adapter extends AudioPlayer, VideoPlayer {
	public void adapt(AudioPlayer audioPlayer);

	public void adapt(VideoPlayer videoPlayer);
}

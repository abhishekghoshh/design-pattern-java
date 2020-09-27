package com.structural.adapter.adapter;

import com.structural.adapter.audioplayer.AudioPlayer;
import com.structural.adapter.videoplayer.VideoPlayer;

public interface Adapter extends AudioPlayer,VideoPlayer{
	public void adapt(AudioPlayer audioPlayer);
	public void adapt(VideoPlayer videoPlayer);
}

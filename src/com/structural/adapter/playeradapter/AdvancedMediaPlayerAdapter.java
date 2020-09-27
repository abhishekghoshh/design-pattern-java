package com.structural.adapter.playeradapter;

import com.structural.adapter.audioplayer.MediaPlayerInterface;
import com.structural.adapter.videoplayer.AdvancedMediaPlayerInterface;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayerInterface advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer) {
        advancedMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMusicPlayer.loadFilename(filename);
        advancedMusicPlayer.listen();
    }
}

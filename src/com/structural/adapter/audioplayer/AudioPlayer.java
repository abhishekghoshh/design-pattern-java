package com.structural.adapter.audioplayer;

public class AudioPlayer implements MediaPlayerInterface {
	
    @Override
    public void play(String audioType, String filename){
    	switch(audioType.toUpperCase()) {
    		case "MP3":
    			System.out.println("Playing mp3 file. Name: " + filename);
    		default:
    			System.out.println("Invalid media. " + audioType + " format not supported");
    	}
    }
}
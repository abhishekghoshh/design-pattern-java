package com.structural.adapter;

public class MP3Player implements AudioPlayer {
	String className = this.getClass().getSimpleName();

	@Override
	public void play(String audioType, String filename) {
		switch (audioType.toUpperCase()) {
		case "MP3":
			System.out.println(className + " : Playing mp3 file. Name: " + filename);
			break;
		default:
			System.out.println(className + " Invalid media. " + audioType + " format not supported");
		}
	}
}
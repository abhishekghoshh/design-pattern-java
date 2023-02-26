package com.structural.adapter;

public class Mp4Player implements VideoPlayer {
	String myFile;
	String className = this.getClass().getSimpleName();

	@Override
	public void loadFilename(String filename) {
		myFile = filename;
	}

	@Override
	public void listen() {
		System.out.println(className + " : Playing mp4 file.  Name: " + myFile);
	}
}
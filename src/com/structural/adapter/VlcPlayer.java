package com.structural.adapter;

public class VlcPlayer implements VideoPlayer {
	String myFile;
	String className = this.getClass().getSimpleName();

	@Override
	public void loadFilename(String filename) {
		myFile = filename;
	}

	@Override
	public void listen() {
		System.out.println(className + " : Playing vlc file.  Name: " + myFile);
	}
}
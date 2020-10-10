package com.behavioral.command.command;

import com.behavioral.command.filesystem.FileSystem;

public class WriteCommand implements Command{
	private FileSystem fileSystem;

	public WriteCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}
}

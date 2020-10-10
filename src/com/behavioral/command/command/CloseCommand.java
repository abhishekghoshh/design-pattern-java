package com.behavioral.command.command;

import com.behavioral.command.filesystem.FileSystem;

public class CloseCommand implements Command {

	private FileSystem fileSystem;

	public CloseCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}

}

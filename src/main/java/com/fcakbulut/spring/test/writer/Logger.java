package com.fcakbulut.spring.test.writer;

public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

}

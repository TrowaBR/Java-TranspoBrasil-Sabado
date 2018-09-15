package br.com.cursojava.util;

import java.util.Scanner;

public class Console {
	
	private static Console console = null;
	
	private Scanner scanner;
	
	public Console() {
		scanner = new Scanner(System.in);
	}
	
	public static Console getInstance() {
		if (console == null)
			console = new Console();
	
		return console;
	}

	public String readLine() {
		return scanner.nextLine();
	}
}

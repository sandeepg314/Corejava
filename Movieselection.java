package javabeginer;

import java.util.Scanner;

public class Movieselection {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		String Choice,Musical;
		System.out.println("Would You Like to watch Comdey? (Yes/No)");
		Choice=KeyBoard.next();
		if (Choice.equalsIgnoreCase("yes")) {
			System.out.println("Venky/Sontham/Aadhurs");
		}
		else if (Choice.equalsIgnoreCase("no")){
			System.out.println("Would you like to watch Musical? (Yes/No)");
			Musical=KeyBoard.next();
			if (Musical.equalsIgnoreCase("yes")) {
				System.out.println("Orange/Athadu/RRR");
			}
			else {
				System.out.println("Arundhathi/chandramukhi/virupaksha");
			}
		}
		}

}

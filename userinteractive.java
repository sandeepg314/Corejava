package javabeginer;

import java.util.Scanner;

public class userinteractive {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		String name;
		System.out.println("enter Your name: ");
		name=KeyBoard.nextLine();
		System.out.println("Welcome to New World "+name);
		int BornYear;
		System.out.println("please enter you DOb: ");
		BornYear=KeyBoard.nextInt();
		int age=2023-BornYear;
		System.out.println("hey "+name+" You are too YOung just "+age+" years old");

	}

}

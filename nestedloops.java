package javabeginer;

import java.util.Scanner;

public class nestedloops {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		System.out.println("How many rows you want to print!!");
		int rows=KeyBoard.nextInt();
		System.out.println("Here you go...");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}

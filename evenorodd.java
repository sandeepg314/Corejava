package javabeginer;

import java.util.Scanner;
public class evenorodd {
public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		int number1;
		System.out.println("Enter Your Number: ");
		number1=KeyBoard.nextInt();
		if (number1%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("odd Number");
		}

	}

}

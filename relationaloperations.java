package javabeginer;

import java.util.Scanner;

public class relationaloperations {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		float number1,number2;
		System.out.println("enter number1: ");
		number1=KeyBoard.nextFloat();
		System.out.println("enter number2: ");
		number2=KeyBoard.nextFloat();
		if (number1==number2) {
			System.out.println("the numbers are Realtional");
		}
		else{
			System.out.println("the numebrs are not relational");
		}
		}

}

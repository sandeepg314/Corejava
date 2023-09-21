package javabeginer;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		int age;
		System.out.println("Please enter your age: ");
		age=KeyBoard.nextInt();
		if(age<=16) {
			System.out.println("Ticket Price= Rs.20 ");
		}
		else if(age>=60) {
			System.out.println("Ticket Price= Rs.10");
		}
		else {
			System.out.println("Ticket Price= Rs.100");
		}
		System.out.println("Welcomw to cinema,Happy to Serve you 24*7!!!!");
		}

}

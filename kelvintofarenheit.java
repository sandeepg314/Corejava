package javabeginer;

import java.util.Scanner;

public class kelvintofarenheit {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		int kelvin1,kelvin2;
		System.out.println("Please enter the starting of kelvin Temp: ");
		kelvin1=KeyBoard.nextInt();
		System.out.println("Please enter the ending of kelvin Temp: ");
		kelvin2=KeyBoard.nextInt();
		System.out.println("kelvin    fahrenheit");
		for (int i=kelvin1;i<=kelvin2;i++) {
			System.out.print(i+"       ");
			double fahrenheit=(i-273.15)*9/5+32;
			System.out.println(fahrenheit);
		}

	}

}

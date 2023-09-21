package javabeginer;

import java.util.Scanner;

public class nestedloops2 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("How many rows you want to print?");
		int rows=Sc.nextInt();
		System.out.println("Here You GO!!");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
// NEED DO IT AGAIN PROGRAM NOT DONE
// OUTPUT SHOULD BE
/* 1
   2  3
   4  5  6
   7  8  9  10 */
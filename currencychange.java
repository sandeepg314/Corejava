package javabeginer;
import java.util.Scanner;
public class currencychange {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		String name;
		System.out.println("please tells us who are you🙌🙌: ");
		name=KeyBoard.nextLine();
		System.out.println("Hey Hi! "+name+", Welcome To My world");
		int BornYear;
		System.out.println("Let us know when you are born: ");
		BornYear=KeyBoard.nextInt();
		int agein2023=2023-BornYear;
		System.out.println("Hey your are too Young "+agein2023+" years Old");
		float indianrupees;
		System.out.println("Please Enter Amount(INR): ");
		indianrupees=KeyBoard.nextFloat();
		float conversionrate=0.012f;
		float USD=indianrupees*conversionrate;
		System.out.println("Hey you "+USD+" US dollars with you");

	}

}

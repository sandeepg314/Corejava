package javabeginer;
import java.util.Scanner;
public class namestartswithS {
	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		String name;
		System.out.println("Please enter your name; ");
		name=KeyBoard.nextLine();
		if (name.length()>0 && Character.toLowerCase(name.charAt(0))=='s') {
			System.out.println("The Name starts with 's'!");
		}
		else {
			System.out.println("The Name does not starts with 's'! ");
		}

	}

}

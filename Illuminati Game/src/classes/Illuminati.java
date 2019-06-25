package classes;
import java.util.Scanner;

public class Illuminati {

	public static void main(String[] args) {
		
		System.out.print("Welcome to Illuminati\n"
				+ "\n1. Start Game"
				+ "\n2. View Rules"
				+ "\n3. End Game\n");
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a number: ");
		int menu_choice = in.nextInt();

	}

}

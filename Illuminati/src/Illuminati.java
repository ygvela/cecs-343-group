import java.util.Scanner;

public class Illuminati {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome to Illuminati: A Game of Conspiracy\n");
		Menu menu = new Menu();
		menu.display_start_menu();
		int menu_num = check_input(1, 3);
		if(menu_num == 1) {
			System.out.print("\nStarting Game...");
			System.out.print("\nEnter the number of players (2-8): ");
			int num_players = check_input(2, 8);
		}
		if(menu_num == 2) {
			System.out.print("\nViewing Rules...");
		}
	}

	public static int check_input(int lower,int upper) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean isValid = false;
		while(!isValid) {
			if(in.hasNextInt()) {
				input = in.nextInt();
				if(input >= lower && input <= upper) {
					isValid = true;
				} else {
					in.nextLine();
					System.out.print("Invalid range. Please enter a number between " +
					lower + " and " + upper + ": ");
				}
			} else {
				in.nextLine();
				System.out.print("Invalid option. Please enter a number: ");
			}
		}
		return input;
	}
}

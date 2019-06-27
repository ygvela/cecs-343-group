import java.util.Scanner;

public class Illuminati {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("WELCOME TO ILLUMINATI: A GAME OF CONSPIRACY\n");
		Menu menu = new Menu();
		menu.display_start_menu();
		int menu_num = check_input(1, 3);
		if(menu_num == 1) {
			start_game();
		}
		if(menu_num == 2) {
			System.out.print("\nViewing Rules...");
		}
	}
	
	public static void start_game() {
		System.out.print("\nEnter the number of players (2-8): ");
		int num_players = check_input(2, 8);
		take_action();
	}
	
	public static void take_action() {
		Menu menu = new Menu();
		int action_count = 0;
		while(action_count != 2) {
			menu.display_actions_menu();
			int action_num = check_input(1, 3);
			if(action_num == 1) {
				take_regular_action();
				action_count++;
			}
			if(action_num == 2) {
				take_free_action();
			}
			if(action_num == 3) {
				System.out.println("Collecting 5 MB...");
			}
		}
	}
	
	public static void take_regular_action() {
		Menu menu = new Menu();
		menu.display_reg_action_menu();
		int reg_action_num = check_input(1, 4);
	}
	
	public static void take_free_action() {
		Menu menu = new Menu();
		menu.display_free_action_menu();
		int free_action_num = check_input(1, 4);
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

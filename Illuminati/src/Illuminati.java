import java.util.Scanner;

public class Illuminati {

	public static int check_input(int lower,int upper) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean invalid = true;
		while (invalid){
			System.out.print("\nSelect a menu option: ");
			input = in.nextInt();
			if(input >= lower && input <= upper) {
				invalid = false;
			}else {
				System.out.print("Invalid Range.");
			}
		}
		return input;
	}
	
	public static void display_start_menu() {
		System.out.print("\n1. Start Game"
				+ "\n2. View Rules"
				+ "\n3. End Game\n");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu_num = 0;
		System.out.print("Welcome to Illuminati: A Game of Conspiracy michellk\n");
		while(menu_num != 3) {
			display_start_menu();
			menu_num = check_input(1,3);
		}
	}
}

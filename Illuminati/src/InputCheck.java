import java.util.Scanner;

public class InputCheck {

	public static int check_num(int lower, int upper) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean isValid = false;
		while (!isValid) {
			if (in.hasNextInt()) {
				input = in.nextInt();
				if (input >= lower && input <= upper) {
					isValid = true;
				} else {
					in.nextLine();
					System.out.print("Invalid range. Please enter a number between " + lower + " and " + upper + ": ");
				}
			} else {
				in.nextLine();
				System.out.print("Invalid option. Please enter a number: ");
			}
		}
		return input;
	}
	
	public static String check_string() {
		Scanner in = new Scanner(System.in);
		String name = "";
		if(in.hasNextLine()) {
			name = in.nextLine();
		}
		
		return name;
	}

}


public class Menu {

	public void display_start_menu() {
		System.out.print("\nSTART MENU"
				+ "\n1. Start game"
				+ "\n2. View rules"
				+ "\n3. End game\n"
				+ "\nEnter a number: ");
	}
	
	public void display_actions_menu() {
		System.out.print("\nACTIONS"
				+ "\n1. Take regular action"
				+ "\n2. Take free action"
				+ "\n3. Take a pass\n"
				+ "\nEnter a number: ");
	}
	
	public void display_reg_action_menu() {
		System.out.print("\nREGULAR ACTIONS"
				+ "\n1. Attack a group"
				+ "\n2. Transfer money"
				+ "\n3. Move a group"
				+ "\n4. Give a group away\n"
				+ "\nEnter a number: ");
	}
	
	public void display_free_action_menu() {
		System.out.print("\nFREE ACTIONS"
				+ "\n1. Drop a group"
				+ "\n2. Use a special card"
				+ "\n3. Gift a special card"
				+ "\n4. Gift money\n"
				+ "\nEnter a number: ");
	}
}

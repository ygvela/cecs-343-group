import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Illuminati {

    public static void main(String[] args) {
        System.out.print("WELCOME TO ILLUMINATI: A GAME OF CONSPIRACY\n");
        Menu menu = new Menu();
        menu.display_start_menu();
        int menu_num = InputCheck.check_num(1, 3);
        if(menu_num == 1) {
            start_game();
        }
        if(menu_num == 2) {
            System.out.print("\nViewing Rules...");
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File("Illuminati Game Rules.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no pdf found
                    System.out.println("Game Rules file not found.");
                }
            }
        }
    }

    public static void start_game() {

        File illuminati_cards = new File("Illuminati Cards.xlsx"); // Change the location and file name as per yours
        Upload extracted_illuminati = new Upload(illuminati_cards);
        ArrayList<ArrayList<Object>> illuminati_list = extracted_illuminati.extractAsList(); // Rows in excel will be returned as list
        System.out.println("\nShuffling illuminati cards");
        Collections.shuffle(illuminati_list);
        //System.out.print(illuminati_list);

        File group_cards = new File("Group Cards.xlsx"); // Change the location and file name as per yours
        Upload extracted_group = new Upload(group_cards);
        ArrayList<ArrayList<Object>> group_list = extracted_group.extractAsList(); // Rows in excel will be returned as list
        System.out.println("\nShuffling group cards");
        Collections.shuffle(group_list);
        //System.out.print(group_list);

        Menu menu = new Menu();
        ArrayList<Player> players = new ArrayList<Player>();
        System.out.print("\nEnter the number of players (2-8): ");
        int num_players = InputCheck.check_num(2, 8);
        System.out.println("Enter player names: ");
        for(int i = 1; i <= num_players; i++) {
        	Player p = new Player();
        	System.out.print("Player " + i + ": ");
        	p.set_Name(InputCheck.check_string());
        	String temp = (String)(illuminati_list.get(i).get(0));
        	p.set_Illuminati(temp);
        	players.add(p);
        }
        show_players(num_players, players);
        
        // CODE HERE: start turn
        menu.display_pass_menu(); //might get put into seperate function
        int pass_num = InputCheck.check_num(1, 2);

        if(pass_num == 1) {
            System.out.println("\nCollecting 5 MB...");
        }
        else if(pass_num == 2) {
            take_action();
        }
    }
    
    public static void show_players(int num_players, ArrayList<Player> players) {
    	System.out.println("\nShowing all players...");
    	for(int i = 0; i < num_players; i++) {
        	System.out.println("Player " + (i+1) + ": \n" + players.get(i));
        }
    }

    public static void take_action() {
        Menu menu = new Menu();
        int action_count = 0;
        int action_num = 0;
        while(action_num != 4) {
            menu.display_actions_menu();
            action_num = InputCheck.check_num(1, 4);
            if(action_num == 1) {
                if(action_count == 2) {
                    System.out.println("You cannot take any more regular actions.");
                }
                else {
                    take_regular_action();
                    action_count++;
                }
            }
            if(action_num == 2) {
                take_free_action();
            }
            if(action_num == 3) {
                System.out.println("\nTaking special power action...");
            }
        }
    }

    public static void take_regular_action() {
        Menu menu = new Menu();
        menu.display_reg_action_menu();
        int reg_action_num = InputCheck.check_num(1, 4);
    }

    public static void take_free_action() {
        Menu menu = new Menu();
        menu.display_free_action_menu();
        int free_action_num = InputCheck.check_num(1, 4);
    }
}
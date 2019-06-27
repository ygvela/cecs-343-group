import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class importFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu_num = 2;
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("Illuminati Game Rules.pdf");
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no pdf found
		    }
		}

		}
	}

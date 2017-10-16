import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Vivod {
	public static void main(String[] args) throws FileNotFoundException {
		
		Logic logic = new Logic("./answers.txt");
		
		Scanner in = new Scanner(System.in);
		 System.out.println(logic.getHello());
		 
		  while (true) {

		            String s = in.nextLine();

		            switch (s) {
		                    case "\"Goodbye\"":
		                        System.out.println(logic.getGoodbye());
		                        System.exit(0);
		                    default:
		                        System.out.println(logic.getRandomAnswer());
		                }
		}
	}

}

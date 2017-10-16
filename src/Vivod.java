import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Vivod {
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "\\C:\\Users\\User\\Desktop\\answers.txt";
		File file = new File(path);
		
		Scanner scanner = new Scanner (file);
		
		System.out.println (scanner.nextLine());
		scanner.close();

	}

}

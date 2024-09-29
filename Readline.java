package buffing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;

public class Readline {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line of text: ");
		String input = br.readLine();
		
		System.out.println("You Entered Input: "+input);

	}

}

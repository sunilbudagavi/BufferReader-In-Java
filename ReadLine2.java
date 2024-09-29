package buffing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text: ");
		String input = sc.readLine();
		System.out.println("You Entered: "+input);
	}
	
}

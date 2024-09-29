package buffing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UppertoLower {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter: ");
		String original = reader.readLine();
		String input = original.toLowerCase().toString();
		System.out.println("Your Entered String is: "+original);
		System.out.println("After Converted into Lowercase.: "+input);
	}
}

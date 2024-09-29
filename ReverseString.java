package buffing;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		String word = reader.readLine();
		
		String sb = new StringBuffer(word).reverse().toString();
		System.out.println(sb);
		
		
	}

}

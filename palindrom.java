package buffing;


import java.io.*;

public class palindrom {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");
		String word = reader.readLine();
		
		String sb = new StringBuffer(word).reverse().toString();
		
		if(word.equals(sb)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a Palindrome.");
		}
		
	}

}

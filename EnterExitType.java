package buffing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterExitType {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String line;
		System.out.println("Enter the Words: ");
		while(!(line=sc.readLine()).equalsIgnoreCase("exit")){
			System.out.println("You have entered: "+line);
			
		}
		if(line.equals("exit")) {
			System.out.println("Exited from the loop");
		}
	}

}

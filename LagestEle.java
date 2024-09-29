package buffing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LagestEle {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int largest = Integer.MIN_VALUE;
		String input;
		
		System.out.println("Enter the numbers until Stop(Type=end): ");
		while(!(input=reader.readLine()).equalsIgnoreCase("end")) {
			int num = Integer.parseInt(input);
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println("Largest: "+largest);
		
	}

}

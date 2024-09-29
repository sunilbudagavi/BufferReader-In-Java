package buffing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CountAverage {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int sum=0;
		int count=0;
		System.out.println("Type exit to complete.");
		System.out.print("Enter Digits now");
		while(!(input=reader.readLine()).equalsIgnoreCase("exit")){
			System.out.print("Enter the Integers: ");
			int num = Integer.parseInt(input);
			sum+=num;
			count++;
		}
		
		if(count>0) {
			double average = (double) sum / count;
			System.out.println("The Average is: "+average);
		}
		else {
			System.out.println("You didn't entered Numbers.");
		}
	}
}

package buffing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddINtegs {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the First Integer: ");
		String num = sc.readLine();
		int num1 = Integer.parseInt(num);
		
		
		System.out.println("Enter the Second Integer: ");
		String num2 = sc.readLine();
		int num3 = Integer.parseInt(num2);
		
		int total = num1+num3;
		System.out.println("The sum of the Two Integers: "+ total);
	}

}

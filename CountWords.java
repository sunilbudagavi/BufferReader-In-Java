package buffing;
import java.io.*;

public class CountWords {
   public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	String line;
	System.out.print("Enter the Sentence: ");
	String input = reader.readLine();
	String[] arr = input.split("\\S+");
	System.out.println("The COunt is: "+ arr.length);
}
}

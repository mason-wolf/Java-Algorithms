package main;
import java.util.Scanner;

public class Console {

	private static Scanner scanner = new Scanner(System.in);
	
	public static double getDouble(String prompt)
	{
		double value = 0;
		
		boolean isValid = false;
		
		while (!isValid)
		{
			System.out.println(prompt);
			if (scanner.hasNextDouble())
			{
				value = scanner.nextDouble();
				isValid = true;
			}
			else 
			{
				System.out.println("Error! Invalid double. Try again.");
			}
			scanner.nextLine();
		}
		
		return value;
		
	}
}

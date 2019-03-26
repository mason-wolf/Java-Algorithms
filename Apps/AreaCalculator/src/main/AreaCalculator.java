package main;

import java.util.Scanner;

public class AreaCalculator {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Person Manager");
		
		scanner = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("\nCalculate area of a circle, square, or rectangle? (c/s/r): ");
			String input = scanner.next();
			
			boolean newEntry = true;
			
			while (newEntry)
			{
				double radius = 0;
				
				if (input.equalsIgnoreCase("c"))
				{
					radius = Console.getDouble("Enter radius: ");
					Circle circle = new Circle(radius);
					System.out.println("The area of the circle you entered is " + circle.getArea());
					newEntry = false;
				}
				else if (input.equalsIgnoreCase("s"))
				{
					radius = Console.getDouble("Enter radius: ");
					Square square = new Square(radius);
					System.out.println("The area of the square you entered is: " + square.getArea());
					newEntry = false;
				}
				else if (input.equalsIgnoreCase("r"))
				{
					double width = Console.getDouble("Enter width: ");
					double height = Console.getDouble("Enter height: ");
					Rectangle rectangle = new Rectangle(width, height);
					System.out.println("The area of the rectangle you entered is " + rectangle.getArea());
					newEntry = false;
				}
				else 
				{
					System.out.println("Invalid option.");
					newEntry = false;
				}	
				
			}
			
		}
	}
	
}

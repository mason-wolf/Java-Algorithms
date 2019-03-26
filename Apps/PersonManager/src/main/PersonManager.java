package main;

import java.util.Scanner;

public class PersonManager {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Person Manager");
		
		scanner = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			
			Boolean newEntry = true;
			
			while (newEntry)
			{

				String selection = Console.getString("Create customer or employee? (c/e)");
				
				if (selection.equalsIgnoreCase("c"))
				{
							
					String firstName = Console.getString("First name: ");
					String lastName = Console.getString("Last name: ");
					String customerNumber = Console.getString("Customer number: ");
					
				    Customer newCustomer = new Customer(firstName, lastName);
				    newCustomer.setCustomerNumber(customerNumber);
				    
				    System.out.println("You enetered a new customer: ");
				    System.out.println(newCustomer.toString());
				    newEntry = false;
					
				}
				else if (selection.equalsIgnoreCase("e"))
				{

					String firstName = Console.getString("First name: ");
					String lastName = Console.getString("Last name: ");
				    String ssn = Console.validateSSN("SSN: ");

				    Employee newEmployee = new Employee(firstName, lastName, ssn);
				    
				    System.out.println("You entered a new employee: ");
				    System.out.println(newEmployee.toString());
				}
				else 
				{
					System.out.println("Error! Entry must be 'c' or 'e'. Try again.");
				}

			}
			
			Boolean validChoice = false;
			
			while (!validChoice)
			{
				System.out.println("Continue? (y/n)");
				choice = scanner.next();
				
				if (choice.equalsIgnoreCase("y"))
				{
					validChoice = true;
				}
				else if (choice.equalsIgnoreCase("n"))
				{
					validChoice = true;
				}
				else 
				{
					System.out.println("Error! Must be 'y' or 'n'. Try again.");
				}
			}
		}
	}

}

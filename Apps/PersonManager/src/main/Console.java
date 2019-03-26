package main;
import java.util.Scanner;

public class Console {

	private static Scanner scanner = new Scanner(System.in);
	
	public static String getString(String prompt)
	{
		System.out.println(prompt);
		String s = scanner.next();
		scanner.nextLine();
		return s;
	}
	
	public static String validateSSN(String prompt)
	{
		Boolean validSSN = false;

		System.out.println(prompt);
		String ssn = scanner.next();
	    scanner.nextLine();
	    
	    while (!validSSN)
	    {
	    	if (ssn.length() < 11 || ssn.length() > 11 || ssn.charAt(3) != '-' && ssn.charAt(6) != '-')
	    	{
		    	System.out.println("Invalid SSN format. Must be XXX-XX-XXXX.");
	    		validSSN = false;
	    	}
		    else
		    {
		    	validSSN = true;
		    }
		    
		    if (!validSSN)
		    {
			    System.out.println("SSN: ");
			    ssn = scanner.next();
		    }
	    }
	    
	    return ssn;
	}

}

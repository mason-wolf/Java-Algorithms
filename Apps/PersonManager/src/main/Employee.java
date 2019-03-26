package main;

public class Employee extends Person {

	private String ssn;
	
	public String getSSN()
	{
	    String first = ssn.substring(0, 3);
	    String middle = ssn.substring(4, 6);
	    String lastFour = ssn.substring(7, 11);
	    
	    for (int i = 0; i < first.length(); i++)
	    {
	    	first = first.replace(first.charAt(i), '*');
	    }
	    
	    for (int i = 0; i < middle.length(); i++)
	    {
	    	middle = middle.replace(middle.charAt(i), '*');
	    }
	    
	    return first + "-" + middle + "-" + lastFour;
	
	}
	
	public void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
	
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nSSN: " + this.getSSN();
	}

}

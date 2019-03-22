package main;

public class Employee extends Person {

	private String ssn;
	
	public String getSSN()
	{

		String maskedSSN = ssn;
		
		for (int i = ssn.length() - 1; i >= ssn.length() - 4; i--)
		{
			maskedSSN.replace(ssn.charAt(i), '*');
		}
		
		return maskedSSN;
	}
	
	public void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
	
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

}

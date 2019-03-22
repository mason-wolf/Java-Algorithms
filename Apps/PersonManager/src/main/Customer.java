package main;

public class Customer extends Person {

	private String customerNumber;
	
	public String getCustomerNumber()
	{
		return customerNumber;
	}
	
	public void setCustomerNumber(String customerNumber)
	{
		this.customerNumber = customerNumber;
	}
	
	public Customer(String firstName, String lastName) 
	{
		super(firstName, lastName);
	}
	
	@Override 
	public String toString()
	{
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nCustomer Number: " + customerNumber;
	}

}

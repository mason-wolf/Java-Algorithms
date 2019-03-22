package main;

public class PersonManager {

	public static void main(String[] args) {

		Customer customer = new Customer("fname", "lastname");
		customer.setCustomerNumber("number");
		
		System.out.println(customer.toString());
		
		Employee employee = new Employee("Mason", "Wolf", "419413137");
		employee.setSSN("419413137");
		
		String cardNumber = "443-2345-1245-3333*321&&2134";
		
		for (int i = 0; i < cardNumber.length(); i++)
		{
			if (cardNumber.charAt(i) == '-')
			{
				cardNumber.replace(cardNumber.charAt(i), ' ');
			}
		}
		
		System.out.println(cardNumber);
	}

}

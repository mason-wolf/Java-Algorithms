package app;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private List<Product> products;
	
	public Invoice()
	{
		products = new ArrayList<>();
	}
	
	public void addProduct(Product item)
	{
		products.add(item);
	}
	
	public List<Product> getProducts()
	{
		return products;
	}
	
	public double getTotal()
	{
		double invoiceTotal = 0;
		
		for (Product product : products)
		{
			invoiceTotal += product.getProductCost();
		}
		
		return invoiceTotal;
	}
}

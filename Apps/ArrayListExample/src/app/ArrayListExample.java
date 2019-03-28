package app;

import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Product firstProduct = new Product();
		firstProduct.setProductId(1);
		firstProduct.setProductCost(25);
		
		Product secondProduct = new Product();
		secondProduct.setProductId(2);
		secondProduct.setProductCost(24);
		
		Invoice invoice = new Invoice();
		invoice.addProduct(firstProduct);
		invoice.addProduct(secondProduct);
		
		List<Product> checkout = invoice.getProducts();
		
		for (Product product : checkout)
		{
			System.out.println("Product ID: " + product.getProductId() + " Cost: " + product.getProductCost());
		}
		
	}

}

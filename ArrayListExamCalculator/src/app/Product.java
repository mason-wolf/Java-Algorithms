package app;

public class Product {

	private String productTitle;
	private String productDescription;
	private double productCost;
	
	public String getProductTitle() {
		return productTitle;
	}
	
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public double getProductCost() {
		return productCost;
	}
	
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	public Product(String title, String description, double cost)
	{
		this.productTitle = title;
		this.productDescription = description;
		this.productCost = cost;
	}
}

package app;

public class Product {
	
	private int productId;
	private String productName;
	private double productCost;
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getProductCost()
	{
		return productCost;
	}
	
	public void setProductCost(double productCost)
	{
		this.productCost = productCost;
	}
	
}

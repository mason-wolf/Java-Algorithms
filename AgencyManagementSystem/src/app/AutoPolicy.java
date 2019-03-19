package app;

public class AutoPolicy extends Policy {

	private String vin;
	private String owner;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	

	@Override
	public void showProductDescription() {
		
		System.out.println("Policy Type: Auto");
		System.out.println("Policy Owner: " + this.getOwner());
		System.out.println("Assigned Agent: " + this.getAssignedAgent().getName());
		
	}
	
	
}

package app;

public class WorkOrder extends Task implements Reportable {

	@Override
	public void showDescription() {
		System.out.println("Work Order ID: \t\t" + getId());
		System.out.println("Description: \t\t" + getDescription());
	}

}

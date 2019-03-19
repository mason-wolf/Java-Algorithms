package app;

public class Ticket extends Task implements Reportable {

	private static int count;
	
	@Override
	public void showDescription() {
		System.out.println("Ticket ID: \t\t" + Task.getId());
		System.out.println("Description: \t\t" + this.getDescription());
		System.out.println("Assigned Technician: \t\t" + this.getAssignedTechnician());
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		Ticket.count = count;
	}
	
	public Ticket()
	{
		Ticket.count++;
	}
}

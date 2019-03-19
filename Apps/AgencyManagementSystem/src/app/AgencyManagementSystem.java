package app;
import storage.DatabaseConnection;

public class AgencyManagementSystem {

	public static void main(String[] args) {
		
		Agent agent = new Agent();
		agent.setAgentId(1);
		agent.setName("Mason Wolf");
		agent.setAgency("Southern American Insurance");
		
		AutoPolicy autoPolicy = new AutoPolicy();
		autoPolicy.setVin("52342362A232");
		autoPolicy.setOwner("John");
		autoPolicy.assignAgent(agent);
		
		Reportable report = autoPolicy;
		report.showProductDescription();
		
		DatabaseConnection db = new DatabaseConnection();
		db.addPolicy(autoPolicy);
	}

}

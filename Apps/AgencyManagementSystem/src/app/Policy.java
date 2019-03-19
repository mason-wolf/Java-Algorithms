package app;

public abstract class Policy implements Reportable {
	
	private int policyId;
	private double coverage;
	private Agent agent;
	
	public double getCoverage() {
		return coverage;
	}
	
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	
	public void assignAgent(Agent agent)
	{
		this.agent = agent;
	}
	
	public Agent getAssignedAgent()
	{
		return this.agent;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

}

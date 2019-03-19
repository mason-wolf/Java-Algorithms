package app;

public abstract class Task {
	
	private static String id;
	private String description;
	private boolean resolved;
	private Technician assignedTechnician;
	private double satisfactionSurveyScore;
	
	public static String getId() {
		return id;
	}
	
	public void setId(String id) {
		Task.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isResolved() {
		return resolved;
	}
	
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	
	
	public Technician getAssignedTechnician() {
		return assignedTechnician;
	}

	public void assignTechnician(Technician assignedTechnician) {
		this.assignedTechnician = assignedTechnician;
	}

	
	public double getSatisfactionSurveyScore() {
		return satisfactionSurveyScore;
	}

	public void setSatisfactionSurveyScore(double satisfactionSurveyScore) {
		this.satisfactionSurveyScore = satisfactionSurveyScore;
	}

	public Task()
	{
		setResolved(false);
	}
}

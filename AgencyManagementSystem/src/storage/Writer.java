package storage;
import app.Policy;

public interface Writer {
	
	Policy addPolicy(Policy policy);
	Policy updatePolicy(Policy policy);
	Policy deletePolicy(Policy policy);
	Policy transferPolicy(Policy policy, int agentId);
	
}

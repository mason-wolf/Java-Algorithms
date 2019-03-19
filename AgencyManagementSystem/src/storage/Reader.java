package storage;
import app.Policy;
import app.Agent;

public interface Reader {
	
	Policy getPolicy(int policyId);
	Agent getAgent(Agent agentId);
}

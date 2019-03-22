import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Test> tests = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Test> getTests() {
		return tests;
	}
	
	public void setTests(ArrayList<Test> tests) {
		this.tests = tests;
	}
		
}

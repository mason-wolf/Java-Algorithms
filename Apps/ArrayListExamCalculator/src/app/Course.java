package app;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private ArrayList<Double> testScores = new ArrayList<>();
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	public void setTestScores(ArrayList<Double> scores)
	{
		testScores = scores;
	}
	
	public ArrayList<Double> getTestScores()
	{
		return testScores;
	}
}

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		  Student newStudent = new Student(); newStudent.setName("Mason");
		  
		  Course firstCourse = new Course(); firstCourse.setName("MIS320");
		  
		  Test firstTest = new Test(); double[] scores = {78, 97, 76 };
		  firstTest.setScores(scores);
		  
		  ArrayList<Test> testList = new ArrayList<>(); testList.add(firstTest);
		  
		  firstCourse.setTests(testList);
		  
		  ArrayList<Course> courseList = new ArrayList<>();
		  courseList.add(firstCourse);
		  
		  newStudent.setCourses(courseList);
		  
		  for (Course courses : courseList) { System.out.println(courses.getName());
		  
		  for (Test testScores : testList) { for (int i = 0; i <
		  testScores.getScores().length; i++) {
		  System.out.println(testScores.getScores()[i]); } } }
		 
	}

}

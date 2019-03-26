import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Quiz5 {

	public static void main(String[] args) {

		MIS320 course = new MIS320();
		
		Student firstStudent = new Student();
		firstStudent.setStudentName("John Smith");
		ArrayList<Double> firstStudentScores = new ArrayList<>();
		firstStudentScores.add(80.0);
		firstStudentScores.add(60.0);
		firstStudentScores.add(70.00);
		Test firstStudentTest = new Test();
		firstStudentTest.setTestScores(firstStudentScores);
		firstStudent.setStudentTest(firstStudentTest);
		
		Student secondStudent = new Student();
		secondStudent.setStudentName("Jane Smith");
		ArrayList<Double> secondStudentScores = new ArrayList<>();
		secondStudentScores.add(100.00);
		secondStudentScores.add(80.00);
		secondStudentScores.add(90.00);
		Test secondStudentTest  = new Test();
		secondStudentTest.setTestScores(secondStudentScores);
		secondStudent.setStudentTest(secondStudentTest);
		
		Student thirdStudent = new Student();
		thirdStudent.setStudentName("John Doe");
		ArrayList<Double> thirdStudentScores = new ArrayList<>();
		thirdStudentScores.add(80.00);
		thirdStudentScores.add(70.00);
		thirdStudentScores.add(60.00);
		Test thirdStudentTest = new Test();
		thirdStudentTest.setTestScores(thirdStudentScores);
		thirdStudent.setStudentTest(thirdStudentTest);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(firstStudent);
		students.add(secondStudent);
		students.add(thirdStudent);
		
		course.setStudents(students);
		
		System.out.println(classAverage(course));
		
	}
	
	static double classAverage(MIS320 course)
	{
		double classAverage = 0;
		double average = 0;
		double totalAverage = 0;
		
		for (Student student : course.getStudents())
		{
			Test test = student.getStudentTest();
			
			double total = 0;
			
			for (Double score : test.getTestScores())
			{
				total += score;
			}
			
			average = total / student.getStudentTest().getTestScores().size();
			totalAverage += average;
		}
		
		classAverage = totalAverage / course.getStudents().size();
		
		return classAverage;
	}

}

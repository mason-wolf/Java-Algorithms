package app;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PracticeProject {

	private static Scanner scanner;

	public static void main(String[] args) {
		
	      scanner = new Scanner(System.in);
	      ArrayList<Student> studentList = new ArrayList<>();
	      
	      System.out.println("Enter number of students: ");
	      int studentCount = scanner.nextInt();
	      
	      for (int i = 0; i < studentCount; i++)
	      {
	    	  System.out.println("Enter student " + (i + 1) + " name: ");
	    	  String studentName = scanner.next();
	    	  
	    	  Student newStudent = new Student();
	    	  ArrayList<Course> courseList = new ArrayList<>();

	    	  
	    	  newStudent.setName(studentName);
	    	  
	    	  System.out.println("Enter number of courses for " + studentName + ": ");
	    	  int courseCount = scanner.nextInt();
	    	  
	    	  for (int j = 0; j < courseCount; j++)
	    	  {
	    		  System.out.println("Enter name for course " + (j + 1) + ": ");
	    		  String courseName = scanner.next();
	    		  Course newCourse = new Course();
	    	   	  ArrayList<Double> testScores = new ArrayList<>();
	    		  newCourse.setCourseName(courseName);
	    		  
	    		  System.out.println("Enter number of tests for " + courseName + ": ");
	    		  int testCount = scanner.nextInt();
	    		  
	    		  for (int k = 0; k < testCount; k++)
	    		  {
	    			  System.out.println("Enter grade for test " + (k + 1) + ": ");
	    			  double grade = scanner.nextDouble();
	    			  testScores.add(grade);
	    		  }
	    		  
	    		  newCourse.setTestScores(testScores);
	    		  courseList.add(newCourse);
	    	  }
	    	  
    		  newStudent.setCourses(courseList);
    		  studentList.add(newStudent);
	      }
	      
	      for (Student student : studentList)
	      {
	    	  System.out.println("Student Name: " + student.getName());
	    	  
	    	  for (Course course : student.getCourses())
	    	  {
	    		  System.out.println("\tCourse: " + course.getCourseName());
	    		  
	    		  List<Double> grades = course.getTestScores();
	    		  ListIterator<Double> gradeIterator = grades.listIterator();
	    		  
	    		  while (gradeIterator.hasNext())
	    		  {
	    			  System.out.println("\t\tTest " + (gradeIterator.nextIndex() + 1) + " score: " + gradeIterator.next());
	    		  }
	    	  }
	    	  
	    	  System.out.println("\n");
	      }	      
	}

}

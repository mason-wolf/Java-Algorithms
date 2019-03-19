package app;

import java.util.Scanner;

public class ExamGradingSystem {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int totalStudents = scanner.nextInt();
		
		Student[] students = new Student[totalStudents];
		
		for (int i = 0; i < totalStudents; i++)
		{
			System.out.println("Enter student name: ");
			String studentName = scanner.next();
			
			MIS320 MIS320Grades = new MIS320();
			double[] grades = new double[3];
			
			for (int j = 0; j < MIS320Grades.getGrades().length; j++)
			{
				System.out.println("Enter MIS320 grade for exam " + (j + 1) + ": ");
				grades[j] = scanner.nextDouble();
			}
			
			MIS320Grades.setGrades(grades);
			
			MIS330 MIS330Grades = new MIS330();
			grades = new double[3];
			
			for (int k = 0; k < MIS320Grades.getGrades().length; k++)
			{
				System.out.println("Enter MIS330 grade for exam: " + (k + 1) + ": ");
				grades[k] = scanner.nextDouble();
			}
		
			MIS330Grades.setGrades(grades);

			Student newStudent = new Student();
			newStudent.setName(studentName);
			newStudent.setMIS320(MIS320Grades);
			newStudent.setMIS330(MIS330Grades);
			
			students[i] = newStudent;
		}
		
		for (int i = 0; i < students.length; i++)
		{
			double MIS320Average = getMIS320StudentAverage(students[i]);
			System.out.println("MIS 320 Average: " + MIS320Average + "%");
			
			double MIS330Average = getMIS330StudentAverage(students[i]);
			System.out.println("MIS 330 Average: " + MIS330Average + "%");
		}
	}
	
	static double getMIS320StudentAverage(Student student)
	{
		double average = 0;
		double total = 0;
		
		for (int i = 0; i < student.getMIS320().getGrades().length; i++)
		{
			total += student.getMIS320().getGrades()[i];
		}
		
		average = total / 3;
		return average;
	}
	
	static double getMIS330StudentAverage(Student student)
	{
		double average = 0;
		double total = 0;
		
		for (int i = 0; i < student.getMIS330().getGrades().length; i++)
		{
			total += student.getMIS330().getGrades()[i];
		}
		
		average = total / 3;
		return average;
	}

}

package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileIOExample {


	private static BufferedReader fileReader;
	
	public static void main(String[] args) throws IOException {
		
		String file = "students.txt";
		Paths.get(file);
		
		fileReader = new BufferedReader(new FileReader(file));
		String line = fileReader.readLine();
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		while (line != null)
		{
			String[] studentData = line.split("#");
			
			Student student = new Student(studentData[1], Double.parseDouble(studentData[2]));
			studentList.add(student);
			line = fileReader.readLine();
		}
		
		fileReader.close();
		
		for (Student student : studentList)
		{
			System.out.println(student.getName() + "\t" + student.getGrade());
		}
	}


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProject;

import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        // Create an exam object.
        Exam exam = new Exam();
        Student student;
        String name = "";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter student's name: ");
            name = sc.next();

            System.out.println("Enter exam 1 grade:");
            exam.setExamGrade1(sc.nextDouble());

            System.out.println("Enter exam 2 grade:");
            exam.setExamGrade2(sc.nextDouble());

            System.out.println("Enter exam 3 grade:");
            exam.setExamGrade3(sc.nextDouble());

            // Create the student object and assign the exam scores.
            student = new Student(name, exam);

            double average = StudentAverage(student);
            double max = FindMaxOfTests(student);
            System.out.println(student.getName() + "'s average score is " + average);
            System.out.println("Max score: " + max);
            System.out.println("Continue? (y /n");

            choice = sc.next();
        }

    }

    public static double FindMaxOfTests(Student student) {
        double max = student.getExams().getExamGrade1();

        if (student.getExams().getExamGrade2() > student.getExams().getExamGrade1() && student.getExams().getExamGrade2() > max) {
            max = student.getExams().getExamGrade2();
        }

        // Check if the third score is larger than the previous two.
        if (student.getExams().getExamGrade3() > student.getExams().getExamGrade2() || student.getExams().getExamGrade3() > student.getExams().getExamGrade1() && student.getExams().getExamGrade3() > max) {
            max = student.getExams().getExamGrade3();
        }

        return max;
    }

    public static double StudentAverage(Student student) {
        double average = 0;
        int total = 0;
        total += student.getExams().getExamGrade1();
        total += student.getExams().getExamGrade2();
        total += student.getExams().getExamGrade3();
        average = total / 3;
        return average;
    }
}

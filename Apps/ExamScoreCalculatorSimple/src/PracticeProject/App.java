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

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double numberTests = 0;
        sc = new Scanner(System.in);
        
        System.out.print("Enter number of tests: ");
        numberTests = sc.nextDouble();
        calculateScores(numberTests);
    }
    
    static void calculateScores(double numberTests)
    {
        double total = 0;
        double testResult;
        double previous = 0;
        double max = 0;
       
        for (int i = 0; i < numberTests; i++)
        {
            i += 1;
            System.out.print("Enter score for test " + i + ": ");
            i -= 1;
            testResult = sc.nextDouble();
            
            if (testResult > previous && testResult > max)
            {
                max = testResult;
            }
            
            total += testResult;
            previous = testResult;
            
        }
        
        showResult(total, numberTests, max);
    }
    
    // Get averages between two doubles.
    static double getAverage(double totalGrade, double numberTests)
    {
        double average = totalGrade / numberTests;
        return average;
    }
    
    // Show grade calculations.
    static void showResult(double total, double numberTests, double max)
    {
        double average = getAverage(total, numberTests);
        
        String letterGrade = " ";
        
        if (average >= 90)
        {
            letterGrade = "A";
        }
        else if (average >= 80 && average < 90)
        {
            letterGrade = "B";
        }
        else if (average >= 70 && average < 80)
        {
            letterGrade = "C";
        }
        else if (average >= 60 && average < 70)
        {
            letterGrade = "D";
        }
        else if ( average < 60)
        {
            letterGrade = "F";
        }
        
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Letter Grade: " + letterGrade);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProject;

/**
 *
 * @author Mason
 */
public class Student {
    private String name;
    private Exam exams;
    private static int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exam getExams() {
        return exams;
    }

    public void setExams(Exam exams) {
        this.exams = exams;
    }

    public Student(String name, Exam exams) {
        this.name = name;
        this.exams = exams;
        count++;
    }

    
    
}

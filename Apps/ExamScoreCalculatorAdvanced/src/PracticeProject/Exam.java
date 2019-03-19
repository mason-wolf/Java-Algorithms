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
public class Exam {
    private double examGrade1;
    private double examGrade2;
    private double examGrade3;

    public double getExamGrade1() {
        return examGrade1;
    }

    public void setExamGrade1(double examGrade1) {
        this.examGrade1 = examGrade1;
    }

    public double getExamGrade2() {
        return examGrade2;
    }

    public void setExamGrade2(double examGrade2) {
        this.examGrade2 = examGrade2;
    }

    public double getExamGrade3() {
        return examGrade3;
    }

    public void setExamGrade3(double examGrade3) {
        this.examGrade3 = examGrade3;
    }

    public Exam(double examGrade1, double examGrade2, double examGrade3) {
        this.examGrade1 = examGrade1;
        this.examGrade2 = examGrade2;
        this.examGrade3 = examGrade3;
    }
    
    public Exam()
    {
        this.examGrade1 = 0;
        this.examGrade2 = 0;
        this.examGrade3 = 0;
    }
    
}

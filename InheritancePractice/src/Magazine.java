/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mason
 */
public class Magazine extends Book {
    
    private String monthlyIssue;
    
    public Magazine()
    {
        super();
        monthlyIssue = "";
    }

    public String getMonthlyIssue() {
        return monthlyIssue;
    }

    public void setMonthlyIssue(String monthlyIssue) {
        this.monthlyIssue = monthlyIssue;
    }
    
}

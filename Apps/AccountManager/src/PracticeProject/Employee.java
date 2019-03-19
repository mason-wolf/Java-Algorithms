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
public class Employee {
    private String name;
    private int id;
    
    public Employee()
    {
        name = "";
        id++;
    }

    public Employee(int tempId, String tempName)
    {
        id = tempId;
        name = tempName;
    }
    
    public void setName(String tempName)
    {
        name = tempName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setId(int tempId)
    {
        id = tempId;
    }
    
    public int getId()
    {
        return id;
    }

}

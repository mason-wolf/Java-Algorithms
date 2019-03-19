/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mason
 */
public class FileManager {

    public static void saveEmployees(List<Employee> employees) throws FileNotFoundException {
        try (PrintWriter fileWriter = new PrintWriter("employees.txt")) {
            employees.forEach((e) -> {
                fileWriter.println(e.getId() + "#" + e.getName());
            });
        }
    }

    public static List<Employee> getEmployees() throws FileNotFoundException, IOException {
        List<Employee> employees = new ArrayList();

        try (BufferedReader buffer = new BufferedReader(new FileReader("employees.txt"))) {
 
            String line = buffer.readLine();

            while (line != null) {
                String[] temp = line.split("#");
                Employee employee = new Employee(Integer.parseInt(temp[0]), temp[1]);
                employees.add(employee);
                line = buffer.readLine();
            }
        }
        catch (Exception e) {
            File file = new File("employees.txt");
            file.createNewFile();
        }
        return employees;
    }
}

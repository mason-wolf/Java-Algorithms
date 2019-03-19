
package PracticeProject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class App {
    
    // List to store employees.
    public static List<Employee> employees;
    // Scanner to recieve user input.
    public static Scanner scanner = new Scanner(System.in);
    public static String userInput = "";
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
            showMenu();
            employees = FileManager.getEmployees();
            userInput = scanner.next();
            
            while (true)
            {
                switch (userInput)
                {
                    case "1":
                        addEmployee();
                        break;
                    case "2":
                        viewEmployees();
                        break;
                    case "3":
                        System.out.print("Enter name to search: ");
                        userInput = scanner.next();               
                        findEmployee(userInput);
                        showMenu();
                        break;
                    case "4":
                        System.out.println("Enter employee name to remove: ");
                        userInput = scanner.next();
                        deleteEmployee(userInput);
                        showMenu();
                        break;
                    case "5":
                         System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid selection.");
                        System.out.print("> ");
                        break;
                }                 
             userInput = scanner.next();           
            }
    }
    
    // Show menu options.
    public static void showMenu() 
    {
        System.out.println("\n1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employees");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("> ");
    }
    
    // Add new employee with unique id. 
    public static void addEmployee() throws FileNotFoundException
    {
        System.out.print("Enter name: ");     
        userInput = scanner.next();
        
        Employee newEmployee = new Employee();
        int employeeIds = getEmployeeCount();

        newEmployee.setName(userInput);
        newEmployee.setId(employeeIds + 1);
        
        employees.add(newEmployee);
        FileManager.saveEmployees(employees);
        showMenu();
    }
    
    // Retrieve total number of employees.
    public static int getEmployeeCount()
    {
        int count = 0;
        
        count = employees.stream().map((_item) -> 1).reduce(count, Integer::sum);
        
        return count;
    }
    
    // View all employees.
    public static void viewEmployees()
    {
        employees.forEach((e) -> {
            System.out.println("id: " + e.getId() + "\t name: " + e.getName());
        });
          showMenu();
    }
    
    // Search all employees to retrieve employee with matching name.
    public static Employee searchEmployees(String nameToSearch)
    {
        Employee employeeFound = new Employee();
        
        for (Employee e: employees)
        {
            if (e.getName().equals(nameToSearch))
            {
                employeeFound = e;
            }
        }
        
        return employeeFound;
    }
    
    // Retrieve employee record with matching name.
    public static void findEmployee(String nameToFind)
    {
        Employee employeeToFind = searchEmployees(nameToFind);
        
        if (employeeToFind.getName().isEmpty())
        {
            System.out.println("Employee not found.");
        }
        else 
        {
            System.out.println("id: " + employeeToFind.getId() + "\t name: " + employeeToFind.getName());
        }

    }
    
    // Delete employee with matching name.
    public static void deleteEmployee(String nameToDelete) throws FileNotFoundException
    {
        Employee employeeToDelete = searchEmployees(nameToDelete);
        
        if (employeeToDelete.getName().isEmpty())
        {
            System.out.println("Employee not found.");
        }
        else 
        {
            for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();)
            {
                Employee employee = iterator.next();
                if (employee == employeeToDelete)
                {
                    iterator.remove();
                }
            }
            
            FileManager.saveEmployees(employees);
            System.out.println("Employee removed.");
        }
    }
}

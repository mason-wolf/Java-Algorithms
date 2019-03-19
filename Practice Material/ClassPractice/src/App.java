

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter product code: ");
            String productCode = sc.next();
            
            Product product = ProductDB.getProduct(productCode);
            
            System.out.println("PRODUCT: " + product.getDescription());
            System.out.println("PRICE: " + product.getPrice());
            System.out.print("Continue? (y / n) :");
            choice = sc.next();
        }

   
    }
    
}

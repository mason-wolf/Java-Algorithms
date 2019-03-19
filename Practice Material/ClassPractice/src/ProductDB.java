/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mason
 */
public class ProductDB {
    public static Product getProduct(String productCode)
    {
        Product product = new Product();
        product.setCode(productCode);
        
        if (productCode.equalsIgnoreCase("1"))
        {
            product.setDescription("Product 1");
            product.setPrice(10.99);
        }
        else 
        {
            product.setDescription("Product not found.");
        }
        return product;
    }
}

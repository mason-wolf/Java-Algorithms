/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mason
 */
public class Book extends Product {
    
    private String author;
    
    public Book()
    {
        super();
        author = "";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDescription() {
        System.out.println("a book");
    }
    
}

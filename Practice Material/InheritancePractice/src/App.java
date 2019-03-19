
public class App {

 
    public static void main(String[] args) {
        
//        Book book = new Book();
//        book.setCode("1");
//        book.setDescription("Lord of the Rings");
//        book.setPrice(9.99);
//        book.showDescription();
        
        Magazine magazine = new Magazine();
        magazine.setMonthlyIssue("Jan 1");
        
        Book book = magazine;
        book.setAuthor("IGN");
        
        Magazine newMagazine = (Magazine) book;
        newMagazine.setPrice(2.99);
   
        
        
        if (newMagazine instanceof Book)
        {
            book.showDescription();
        }
        
        
        
    }
    
}

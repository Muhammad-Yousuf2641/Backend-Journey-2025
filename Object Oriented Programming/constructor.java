class Book{
    
 String title;
 String author;
 int price;
    
 //  declare a parameterized constructor  
 
    Book(String titlebook, String bookauthor, int bookprice) {
     
    this.title=titlebook;
    this.author=bookauthor;
    this.price=bookprice;
    // printing books details
    System.out.println("The Book Details are :"+titlebook +" "+ bookauthor +" "+ bookprice);}
 
 /* 
    // declare a parameterized constructor with default values
    Book() {
     
    this.title="Effective JAVA";
    this.author="Jousha Bloch";
    this.price=100;
    System.out.println("The Book Is :"+title +" "+ author +" "+ price);
}
*/

}
    public class constructor {
    public static void main(String[] args) {
        
    /* 
    // instantiate an object without parameterize constructor
    Book book2 = new Book();
    */
         
    // instantiate an object parameterize constructor
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 20);
        Book book2 = new Book("oxford", "Y.M joseph", 200);


    }
}
   

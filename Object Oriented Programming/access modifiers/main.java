
import components.*;

public class main{
    public static void main(String[] args) {
        // Create a new instance of the library
        library library = new library();
        library.books("EFFECTIVE JAVA",1050);
        library.books("Clean Code", 800);
        library.getfine();
        // library.total_books(10);
        //👆it throws an error while i'm calling protected method due to not having same package or a subclass
    }
}
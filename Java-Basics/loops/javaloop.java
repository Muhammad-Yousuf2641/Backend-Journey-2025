import java.util.*;
public class javaloop {
public static void main(String[] args) {

    int number;

    // create an object 
    System.out.println("Enter Table number" );
    Scanner scobj=new Scanner(System.in);
    number=scobj.nextInt();

    // printing table
    System.out.println("printing table ...");
    for(int i =1; i<= 10; i++ ){
        System.out.println(number +" X "+ i + " = "+ number*i );
    }
}
}

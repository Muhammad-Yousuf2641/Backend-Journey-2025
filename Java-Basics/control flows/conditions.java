//  control flow and conditions 
import java.util.Scanner;

// Even or Odd
// Problem: Take a number as input and check whether it is even or odd.
// Concepts: Data types, modulus operator %, conditionals.


public class conditions {
 public static void main(String[] args) {
     
    int number=0;
    System.out.println("Enter Number :");
    Scanner obj =new Scanner(System.in);
    number=obj.nextInt();

//  conditions using ternaory operator 
    String result = (number % 2==0) ? " Your Number is Even " :
     (number % 2 !=0) ? "Your Number is Even " 
     : "invalid number";

     System.out.println(result);
 }   
}
// String result = (time < 18) ? "Good day." : "Good evening.";
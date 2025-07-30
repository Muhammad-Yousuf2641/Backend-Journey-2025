
import java.util.Scanner;

public class variables_datatypes {
public static void main(String[] args) {
    

    String username;
    int age;
    int salary;

    // instance an scanner object 
    Scanner obj =new Scanner(System.in);
    // taking input
    System.out.println("Enter your name here ");
    username=obj.nextLine();
    System.out.println("Enter your age here ");
    age=obj.nextInt();
    System.out.println("Enter your salary here ");
    salary=obj.nextInt();
    
    // printing an output
    System.out.println(" username :"+ username +" age :"+ age +" salary :"+ salary);


}
}
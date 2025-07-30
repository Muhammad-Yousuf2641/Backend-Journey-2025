
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
     //declare variables
     int num1;
     int num2;
     String oper;
     
    // create scanner object 
    System.out.println(" Enter Numbers :");
        try (Scanner obj = new Scanner(System.in)) {
            num1=obj.nextInt();
            num2=obj.nextInt();
            obj.nextLine();
            
            // assiging values to the variables
            System.out.print(" Select operator: ");
            oper=obj.nextLine();
            
            //operations
            int sum=num1+num2;
            int sub=num1-num2;
            int mul=num1*num2;
            int div=num1/num2;
            
            //  conditions
            if(oper.equals("+")){
                System.out.println(sum);
            }
            else if(oper.equals("-")){
                System.out.println(sub);
            }
            else if(oper.equals("*")){
                System.out.println(mul);
            }
            else if(oper.equals("/")){
                System.out.println(div);
            }
            else{
                System.out.println("invalid operator");
            }   }
    }
}
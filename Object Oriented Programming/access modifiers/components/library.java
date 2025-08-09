package components;

import java.util.Scanner;

public class library{
// public method
 public void books(String title,int price){
    System.out.println("Book Title: "+title+" Price: "+price);
 }   


//  private method
    private int calulate_fine(int days){
        int fine=100;
        if(days>7){
            int late= days-7;
            fine=fine*late;
        }
            System.out.println("Your fine is: "+fine);
            return fine;
    }

    // // to access the private method use getter setters
    public void getfine(){
        System.out.println("Enter the days Book taken: ");
        Scanner sc =new Scanner(System.in);
        calulate_fine(sc.nextInt());
        
        
    }

    // protected method 
    protected void total_books(int Tal_book){
        System.out.println("Total Books: "+Tal_book);
    }

}

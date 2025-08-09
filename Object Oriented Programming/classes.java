class car{

    String brand;
    String model;
    String year;


    // display method
    public void print_details(){

        System.out.println(
            "Your car brand is "+this.brand+"\n"
            +"Your car model is "+this.model+"\n"
            +"Your car manufacture year is "+this.year+"\n"
        );
    }

}

public class classes {

    public static void main(String[] args) {
        //instantitate 3 objects for 3 persons  
        car customer1 = new car();
        car customer2 = new car();
        car customer3 = new car();

        // assigning values 
        // for customer1
        customer1.brand="suzuki";
        customer1.model="mehran";
        customer1.year="2000";
        
        customer2.brand="cherry";
        customer2.model="jac";
        customer2.year="2024";
        
        customer3.brand="hondai";
        customer3.model="elantra";
        customer3.year="2025";

        // calling methods 
        customer1.print_details();
        customer2.print_details();
        customer3.print_details();
        
    }
}
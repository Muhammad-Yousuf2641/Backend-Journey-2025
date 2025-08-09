// polymorphism concept
 class calulator{
    
    void add(int num1,int num2){
        System.out.println("Addition of two numbers is : "+(num1+num2));
    }
    // method overloading
    void add(int num1,int num2,int num3){
        System.out.println("Addition of three numbers is : "+ (num1+num2+num3));
    } 

    // Again overloading 
    void add(double num1,double num2){
        System.out.println("Addition of two decimal numbers is : "+(num1+num2));
    }
}

// creating a polymorphism class
public class overloading {
public static void main(String[] args) {
    // creating an object of calculator class
    calulator objCalulator=new calulator();
    objCalulator.add(10,20);
    objCalulator.add(20, 30,50);
    objCalulator.add(10.5, 20.0);

}
}
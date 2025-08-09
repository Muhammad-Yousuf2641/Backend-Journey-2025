// 9. Abstraction
// Create an abstract class Shape with abstract method area() and normal method display().
// Task: Implement Rectangle and Circle classes and use abstract class reference to call their area() methods.

abstract class Shape{
    abstract void area();

    // normal method display 
    void display(){
        System.out.println("This is a shape");
    }
}

// derived class Rectangle
class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length=length;
        this.width=width;
    }

    // override area method
    @Override
    void area(){
        System.out.println("The area of rectengle is "+length*width);
    }
}

// derived class Circle
class Circle extends Shape{
    private double  radius= Math.random();

    // override method 
    @Override
    void area(){
        System.out.println("The area of circle is "+Math.PI*radius*radius);
    }

}

public class abstraction{
 public static void main(String[] args) {
    Shape shape1 =new Rectangle(4,6);
    shape1.area();
    shape1.display();
    System.out.println(" ");

    Circle shape2 = new Circle();
    shape2.area();
    shape2.display();


 }
}
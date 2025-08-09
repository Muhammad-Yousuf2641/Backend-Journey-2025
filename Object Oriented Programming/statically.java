class Student{
    static String school_name="KBCC Secondary School"; // static variable
    String student_name;

    public Student(String name) {
        this.student_name=name;
        System.out.println(student_name);
    }
    
}
public class statically{
    public static void main(String[] args) {
        // printing the static variable by class name we don't need to instance object for static variable
        System.out.println(Student.school_name);
        
        // instantiate object for non static variable
        Student s1=new Student("John"); // assigning the value to the non static variable
    }
}
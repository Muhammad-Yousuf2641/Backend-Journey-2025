// creating a class student
class Student{
    // declaring a variables 
    String name;
    int rollNum;
    double gpa;

// constructor 
Student(String stdname , int roll, double  gpa){
    this.name=stdname;
    this.rollNum=roll;
    this.gpa=gpa;
}

}

public class object{
public static void main(String[] args) {
    // creating an array of stdudent object
    Student[] students_arr = new Student[5];
    
    students_arr[0]=new Student("farhan",211,2.0);
    students_arr[1]=new Student("ayaan",176,3.7);
    students_arr[2]=new Student("areeb",177,3.5);
    students_arr[3]=new Student("ashar",163,3.5);
    students_arr[4]=new Student("junaid",204,3.9);

    // find the student with highest gpa
    Student topper = students_arr[0];

    // logic
    for (int i = 0; i < students_arr.length; i++) {

        if(students_arr[i].gpa>topper.gpa){
        topper=students_arr[i];
    } }

    // printing the topper name with gpa 
    System.out.println("The Topper is : "+topper.name+" with "+topper.gpa +"gpa");
}}
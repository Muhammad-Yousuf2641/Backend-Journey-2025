class Employee{
    String name;
    int salary;
    
}

// single inheritance extended class
class Manager extends Employee{
    
    String department;

    // constructor
    Manager(String name, int salary, String department) {
        this.name=name;
        this.salary=salary;
        this.department=department;
    }}

    public class Single_inheritance {
    
        public static void main(String[] args) {
            Manager manager = new Manager("John", 50000, "HR");
            System.out.println("Manager details are : \n"+manager.name+" \n"+manager.salary+" \n"+manager.department);
        }
    }



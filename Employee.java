package Employee;

public class Employee {
    
    
    //Fields (attribute)
    String name;
    int id;
    double salary;
 
   //constructor 
public Employee(String name, int id, double salary) {
         this.name = name;
         this.id = id;
         this.salary = salary;
     }
  
    //Method to display employee details
    
        public void displayInfo(){
            System.out.println("Employee ID :" +id);
            System.out.println("Employee name" +name);
            System.out.println("Salary:₹" +salary);
        }

   //Main method 
   public static void main(String[] args) {
    //Creating an object of employee
    Employee emp1 = new Employee("Kos",101,50000.0);
    emp1.displayInfo();
   }




}




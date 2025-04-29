package Employee;

public class Employee {
    
    
    //Fields (attribute)
    String name;
    int id;
    double salary;
    String Location;
 
   //constructor 
public Employee(String name, int id, double salary, String Location) {
         this.name = name;
         this.id = id;
         this.salary = salary;
         this.Location=Location;
     }
  
    //Method to display employee details
    
        public void displayInfo(){
            System.out.println("Employee ID :" +id);
            System.out.println("Employee name" +name);
            System.out.println("Salary:₹" +salary);
            System.out.println("Location:₹" +Location);
        }

   //Main method 
   public static void main(String[] args) {
    //Creating an object of employee
    Employee emp1 = new Employee("Kos",101,50000.0,"Hubli");
    emp1.displayInfo();
   }




}




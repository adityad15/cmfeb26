class Emp {

    int empId;
    String empName;
    double salary;
    int outTime;

    Emp(){
    	 System.out.println("Employee Details\n");
    }
    
    Emp(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {

        // Creating objects using parameterized constructor
        Emp e1 = new Emp();
	Emp e2 = new Emp(101, "Aditya", 50000);
        Emp e3 = new Emp(102, "Rahul", 60000);

	e1.display();
        System.out.println("\n");
        e2.display();
        System.out.println("\n");
        e3.display();	
    }
}

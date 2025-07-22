public class Employee {
    String name;
    int id;
    String designation;
    double salary;

    // No-arg constructor
    Employee() {
        name = "Not Assigned";
        id = 0;
        designation = "None";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy constructor
    Employee(Employee e) {
        this.name = e.name;
        this.id = e.id;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Alice", 101, "Manager", 50000); 
        Employee emp3 = new Employee(emp2);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}

public class Employee{
	int empId;
	String name;
	String department;
	double salary;

	Employee(int empId , String name ,String department , double salary){
		this.empId = empId;
		this.name = name; 
		this.department = department;
		this.salary = salary;
	}
	public void display(){
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[]args){
		Employee emp = new Employee(101,"John","Sales",23000);
		emp.display();
	}
}
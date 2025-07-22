public class EmployeeDetails{
    String name;
    int yearOfJoining;
    String address;

    public EmployeeDetails(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails("Robert", 1994, "64C- WallsStreat");
        EmployeeDetails e2 = new EmployeeDetails("Sam", 2000, "68D- WallsStreat");
        EmployeeDetails e3 = new EmployeeDetails("John", 1999, "26B- WallsStreat");

        System.out.format("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");
        System.out.format("%-10s %-15d %s\n", e1.name, e1.yearOfJoining, e1.address);
        System.out.format("%-10s %-15d %s\n", e2.name, e2.yearOfJoining, e2.address);
        System.out.format("%-10s %-15d %s\n", e3.name, e3.yearOfJoining, e3.address);
    }
}

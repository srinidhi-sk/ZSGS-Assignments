public class StudentDetails {
    String name;
    int roll_no;
    int phone_no;
    String address;

    StudentDetails(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("Sam", 1, 987654321, "123 Main St");
        StudentDetails s2 = new StudentDetails("John", 2, 987654322, "456 Park Ave");

        s1.display();
        s2.display();
    }
}

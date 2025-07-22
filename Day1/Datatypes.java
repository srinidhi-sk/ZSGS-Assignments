public class Datatypes{
	int n = 20; // integer datatype
	double d = 345.78; // double datatype
	float f = 3.14F; // float datatype
	long l = 3425678L;  // long datatype
	char ch = 'A'; // character datatype
	boolean b = true; // boolean datatype
	byte by = 127;//byte datatype

	public void display(){
		System.out.println("Integer : " + n);
		System.out.println("Double : " + d);
		System.out.println("Long Integer : " + l);
		System.out.println("Float : " + f);
		System.out.println("Character : " + ch);
		System.out.println("Boolean : " + b);
		System.out.println("Byte : " + by);
	}

	public static void main(String[]args){
		Datatypes d = new Datatypes();
		d.display();
	}
}
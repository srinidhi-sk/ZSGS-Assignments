public class checkInstance{
	public static void main(String []args){
		checkInstance c1 = new checkInstance();
		if(c1 instanceof checkInstance){
			System.out.println("Instance Of class");
		}
		else{
			System.out.println("Not an Instance of class");
		}
	}
}
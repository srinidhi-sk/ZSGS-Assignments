public class EqualCheck{
	
	public void isEqual(int n1 , int n2){
		switch (n1-n2) {
			case 0:
				System.out.println("Is Equal!");
				break;
		
			default:
				System.out.println("Is not Equal");
				break;
		}
	}

	public static void main(String []args){
		EqualCheck ch =  new EqualCheck();
		int num1 = 28;
		int num2 = 28;
		System.out.println("Is Two Numbers Equal or Not ");
		ch.isEqual(num1,num2);
	}
}
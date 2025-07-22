public class MinimumValue{
	
		int a = 42;
		int b = 12;
		int c = 68;
	public int findMinValue(int a , int b , int c){
		// if statement
		if(a < b && a < c){
			return a;

		}
		else if(b < a && b < c){
			return b;
		}
		else{
			return c;
		}
	}
	public void display(){
		System.out.println("First Number : " + a);
		System.out.println("Second Number : " + b);
		System.out.println("Third Number : " + c);
		System.out.println("Minimum Value of 3 Numbers : " + findMinValue(a,b,c));
	}
		
	public static void main(String[]args){
		MinimumValue  m = new MinimumValue();
		m.display();
	}
}
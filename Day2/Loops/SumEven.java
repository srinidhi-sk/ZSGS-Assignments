public class SumEven{

	public int calculateSum(int n){
		int i = 0;
		int sum = 0;
	
		while( i <= n){
			if(i % 2 == 0){
				sum +=i;
			}
			else{ 
				i++;
				continue;
			}
		i++;
		}
		return sum;
	}
	
	public static void main(String[]args){
		SumEven s = new SumEven();
		int n = 16;
		System.out.println("Sum of Even Numbers: " + s.calculateSum(n));
	}
}		
	
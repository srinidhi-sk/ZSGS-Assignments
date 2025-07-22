public class PowerOf{

	public boolean calculatePowerOf2(int n){
		if(n>0){
			while(n%2==0){
				n = n/2;
			}
		}
		return n==1;
	}

	public static void main(String[]args){
		PowerOf p = new PowerOf();
		int n=8;
		System.out.println("Given number : " + n);
		System.out.println("Power Of 2 : " + p.calculatePowerOf2(n));
	}	
}
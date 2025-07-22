public class FirstSetBit{
	
	public int findfirstSetBit(int n){
		if(n==0) return 0;
		int count = 1;
		while((n & 1) ==0){
			n>>=1;
			count++;
		}
		return count;
	}
	
	public static void main(String[]args){
		FirstSetBit  f = new FirstSetBit();
		int n=18;
		System.out.println("First Set Bit of a Number : " + f.findfirstSetBit(n));
	}
}
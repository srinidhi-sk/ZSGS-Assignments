public class DecimalConversion{
	
	public String decimalToBinary(int num){
		String binary = "";
		while(num > 0){
			int remainder = num % 2;
			binary = remainder + binary;
			num = num / 2 ;
		}
		return binary;
	}
	
	public static void main(String[]args){
		DecimalConversion d = new DecimalConversion();
		int num = 5;
		System.out.println("Decimal Number " + num + " to Binary Number:" + d.decimalToBinary(num));
	}
}
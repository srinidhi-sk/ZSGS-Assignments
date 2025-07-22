public class TypeCasting{
	
	int mark1 = 85;
	int mark2 = 94;
	
	// Explicit TypeCasting
	float Average(int m1, int m2){
		return (float) (m1+m2)/2;
	}

	public static void main(String[]args){
		TypeCasting  t = new TypeCasting();
		System.out.println("Explicit Type Casting: " + t.Average(t.mark1,t.mark2));
	}
}
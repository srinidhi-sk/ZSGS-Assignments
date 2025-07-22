public class CharArrays{
	
	public boolean IdenticalOrNot(int [] x , int [] y){
		if(x.length!=y.length){
			return false;
		} 
		for(int i=0 ; i<x.length;i++){
			if(x[i]!=y[i]){
				return false;
			}
		} 	
		return true;
	}
	
	public static void main(String[]args){
		CharArrays ch = new CharArrays();
		int [] x = { 'm' , 'n' , 'o' , 'p'};
		int [] y = { 'm' , 'n' , 'o' , 'p'};
		System.out.println("Two Arrays are Identical or Not : " + ch.IdenticalOrNot(x,y));
	}
}
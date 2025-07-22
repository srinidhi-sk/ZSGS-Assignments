public class MaximumValue {
        int x = 10;
        int y = 20;

    public int findMaxValue(int n1, int n2) {
        return (n1 > n2) ? n1 : n2; // ternary operator
    }

    public void display(){
    	System.out.println("First Number : " + x);
	    System.out.println("Second Number : " + y);
        System.out.println("Maximum Value : " + findMaxValue(x, y));
    }

    public static void main(String[] args) {
        MaximumValue n = new MaximumValue();
        n.display();
    }
}

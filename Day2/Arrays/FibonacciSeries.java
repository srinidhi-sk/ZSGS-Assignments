public class FibonacciSeries {
    public static void main(String[] args) {
        int nextTerm;
        int n1 = 0;  
        int n2 = 1; 

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < 30; i++) {
            nextTerm = n1 + n2;
            System.out.print(nextTerm + " ");
            n1 = n2;
            n2 = nextTerm;
        }
    }
}

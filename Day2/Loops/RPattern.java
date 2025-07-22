public class RPattern { 
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int mid = rows / 2;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == mid || (i < mid && j == cols - 1) || (i > mid && i == j)) { 
                    System.out.print("R ");
                } 
		else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
	}
}

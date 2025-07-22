import java.util.Scanner;

public class MatrixOperations {
    static Scanner sc = new Scanner(System.in);

    public static int[][] inputMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for row : " + i);
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix, int m, int n) {
        System.out.println(" Displayed Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumElements(int[][] matrix, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum += matrix[i][j];
        return sum;
    }

    public static void rowSum(int[][] matrix, int m, int n) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += matrix[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }

    public static void columnSum(int[][] matrix, int m, int n) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++)
                colSum += matrix[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }

    public static void transposeMatrix(int[][] matrix, int m, int n) {
        System.out.println("Transpose of matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Input elements into matrix");
            System.out.println("2. Display matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose of matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    matrix = inputMatrix(m, n);
                    break;
                case 2:
                    displayMatrix(matrix, m, n);
                    break;
                case 3:
                    System.out.println("Sum of all elements: " + sumElements(matrix, m, n));
                    break;
                case 4:
                    rowSum(matrix, m, n);
                    break;
                case 5:
                    columnSum(matrix, m, n);
                    break;
                case 6:
                    transposeMatrix(matrix, m, n);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

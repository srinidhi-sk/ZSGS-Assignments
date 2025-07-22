import java.util.Scanner;

public class DigitSum {
    public static void print(int[] x, int n) {
        int single = 0, doubleDigit = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9) {
                single += x[i];
            }
            else if (x[i] >= 10 && x[i] <= 99) 
            {
                doubleDigit += x[i];
            }
        }

        System.out.println("Sum of single digit numbers: " + single);
        System.out.println("Sum of double digit numbers: " + doubleDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int len = sc.nextInt();
        int[] x = new int[len];

        System.out.println("Enter array elements:");
        for (int i = 0; i < len; i++) {
            x[i] = sc.nextInt();
        }

        print(x, len);
        sc.close();
    }
}
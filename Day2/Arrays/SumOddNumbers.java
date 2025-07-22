import java.util.Scanner;

public class SumOddNumbers {

    public static void SumOdd(int[]arr){
        int sum = 0;
	for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
               sum += arr[i];
            }
	}
        System.out.println("Sum of odd numbers: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SumOdd(arr);
        sc.close();
    }
}

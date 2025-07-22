import java.util.Scanner;

public class PrimeNumbers {

    public static void checkAndPrintPrimes(int[] numbers) {
        System.out.println("Prime numbers are:");

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n <= 1) continue;
            boolean isPrime = true;

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
        	}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        checkAndPrintPrimes(numbers);

        sc.close();
    }
}

import java.util.Scanner;

public class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; 
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0'; 
                j--;
            }

            carry = sum / 2;
            result = (sum % 2) + result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();
        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();
        System.out.println("Sum: " + addBinary(a, b));
    }
}

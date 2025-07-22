import java.util.Scanner;

public class ExcelColumn {

    public static String convertToTitle(int n) {
        String result = "";

        while (n > 0) {
            n--; 
            int rem = n % 26;
            char ch = (char) ('A' + rem); 
            result = ch + result; 
            n = n / 26;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter column number: ");
        int column = sc.nextInt();

        System.out.println("Excel column title: " + convertToTitle(column));
    }
}

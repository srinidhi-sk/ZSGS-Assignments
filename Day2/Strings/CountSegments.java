import java.util.Scanner;

public class CountSegments {
    public static int countSegments(String s) {
        int count = 0;
        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        System.out.println("Number of segments: " + countSegments(input));
    }
}

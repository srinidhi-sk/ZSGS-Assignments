import java.util.Scanner;

public class RandomChar {
    public static char findRandomChar(String s, String t) {
        int sumS = 0;
        int sumT = 0;

        for (int i = 0; i < s.length(); i++) {
            sumS += s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }

        return (char) (sumT - sumS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t : ");
        String t = sc.nextLine();

        System.out.println("The extra character is: " +findRandomChar(s,t));
    }
}

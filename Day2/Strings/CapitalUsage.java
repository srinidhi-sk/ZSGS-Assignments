import java.util.Scanner;

public class CapitalUsage{
    public static boolean isCorrect(String word) {
        int upperCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            }
        }

        if (upperCount == word.length() || upperCount == 0) {
            return true;
        }

        if (upperCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

	System.out.println("Usage of Capitals is in it right : " + isCorrect(word));
	sc.close();

    }
}

import java.util.Scanner;

public class PascalTriangle {

    public static void print(int rows){  
        int i = 0, j;
        do {
            int space = 0;
            do {
                if (space < rows - i - 1)
                    System.out.print(" ");
                space++;
            } while (space < rows);

            int num = 1;
            j = 0;
            do {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        print(rows);
        sc.close();
    }
}

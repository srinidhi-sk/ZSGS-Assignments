public class Pattern {

    public void digitPattern(int n) {
        int totalRows = n;
        int mid = totalRows / 2;
        int i = 0;
        int currentNumber = 1;

        // Top half
        while (i <= mid) {
            int space = mid - i;
            int j = 0;

            // Leading spaces
            while (space-- > 0) {
                System.out.print("   ");
            }

            // Numbers
            while (j <= i) {
                System.out.printf("%-5d", currentNumber++);
                j++;
            }

            System.out.println();
            i++;
        }

        // Bottom half
        i = mid - 1;
        while (i >= 0) {
            int space = mid - i;
            int j = 0;

            // Leading spaces
            while (space-- > 0) {
                System.out.print("   ");
            }

            // Numbers
            while (j <= i) {
                System.out.printf("%-5d", currentNumber++);
                j++;
            }

            System.out.println();
            i--;
        }
    }

    public void charPattern(char ch) {
        int totalRows = 5;
        int mid = totalRows / 2;
        int i = 0;

        // Top half
        while (i <= mid) {
            int j = 0;
            while (j <= i) {
                System.out.print(ch);
                if (j < i) {
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        // Bottom half
        i = mid - 1;
        while (i >= 0) {
            int j = 0;
            while (j <= i) {
                System.out.print(ch);
                if (j < i) {
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        int n = 5;
        char ch = 'w';

        System.out.println("Digit Pattern");
        p.digitPattern(n);

        System.out.println("Character Pattern");
        p.charPattern(ch);
    }
}

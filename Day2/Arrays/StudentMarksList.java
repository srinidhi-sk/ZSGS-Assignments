import java.util.Scanner;

public class StudentMarksList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 2;
        int subjects = 3;

        int[] rollNo = new int[students];
        int[] total = new int[students];
        double[] average = new double[students];
        int[][] marks = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter details for Student ");
            System.out.print("Enter Roll No: ");
            rollNo[i] = sc.nextInt();

            total[i] = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for Subject :" );
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            average[i] = total[i] / 3;
            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Roll No\t\tTotal Marks\tAverage Marks");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < students; i++) {
            System.out.println(rollNo[i] + "\t\t" + total[i] + "\t\t" +  average[i]);
        }

        sc.close();
    }
}

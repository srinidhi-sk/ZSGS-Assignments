import java.util.Scanner;
public class AgeCounter {

    public static void countAge(int [] ages) {
        int below18 = 0, age18 = 0, above60 = 0;
	for (int i = 0; i < 10; i++) {
            if (ages[i] < 18) {
               below18++;
            } 
	    else if (ages[i] <= 60) {
                age18++;
            } 
	    else {
                above60++;
            }
	}
        System.out.println("Age group counts");
        System.out.println("Under 18: " + below18);
        System.out.println("18 to 60: " + age18);
        System.out.println("Over 60: " + above60);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter the ages of 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
	}
        countAge(ages);
	sc.close();
    }
}

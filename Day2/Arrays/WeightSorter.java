import java.util.Scanner;

public class WeightSorter {
    public static void sortDescending(int[] weights) {
        for (int i = 0; i < weights.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[j] > weights[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = weights[i];
            weights[i] = weights[maxIndex];
            weights[maxIndex] = temp;
        }
    }

    public static void print(int[] weights) {
        System.out.println("Weights in descending order:");
        for (int weight : weights) {
            System.out.println(weight);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weights = new int[10];

        System.out.println("Enter the weights of 10 people:");
        for (int i = 0; i < 10; i++) {
            weights[i] = sc.nextInt();
        }

        sortDescending(weights);
        print(weights);     
    }
}

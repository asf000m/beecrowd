package beecrowd_1178_array_fill_iii;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();

        double[] numbers = new double[100];

        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                numbers[i] = input;
            }
            else {
                numbers[i] = numbers[i - 1] / 2;
            }
            System.out.printf("N[%d] = %.4f", i, numbers[i]);
            System.out.println();
        }

        sc.close();
    }
}

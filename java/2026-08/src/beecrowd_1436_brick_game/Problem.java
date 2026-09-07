package beecrowd_1436_brick_game;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        sc.nextLine();  // Clear buffer.

        for (int i = 0; i < testCases; i++) {

            String agesInput = sc.nextLine();
            
            int teamMembers = Integer.parseInt(agesInput.split(" ")[0]);
            String agesString = agesInput.substring(1).strip();
            
            int[] ages = Arrays.stream(agesString.split(" ")).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(ages);

            int cptIdx = (int) teamMembers / 2;

            System.out.printf("Case %d: %d\n", i + 1, ages[cptIdx]);
        }

        sc.close();
    }
}

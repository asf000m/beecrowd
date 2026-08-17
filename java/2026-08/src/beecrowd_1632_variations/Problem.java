package beecrowd_1632_variations;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String specialCharacters = "aeios";

        // Number of test cases.
        int testCases = sc.nextInt();
        sc.nextLine();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < testCases; i++){
            String password = sc.nextLine().toLowerCase();

            // Counts the number of variations.
            int variations = 1;

            // Loop through each character of the password.
            String[] characters = password.split("");
            for (int j = 0; j < characters.length; j++){
                if (specialCharacters.contains(characters[j]))
                    variations *= 3;
                else
                    variations *= 2;
            }

            output.append(variations);
            output.append("\n");
        }

        System.out.println(output.toString().strip());

        sc.close();
    }
}

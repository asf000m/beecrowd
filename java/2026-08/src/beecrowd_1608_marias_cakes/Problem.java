package beecrowd_1608_marias_cakes;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input T indicating the number of test cases.
        int testCases = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < testCases; i++){
            // Line with D, I and B (cash, ingredientes and cake types);
            String firstInput = sc.nextLine();
            int[] firstInputInt = Arrays.stream(firstInput.split(" ")).mapToInt(Integer::parseInt).toArray();

            // Integer D indicating the cash Maria has to spend.
            int cash = firstInputInt[0];
            
            // Integer I indicating the number of existent ingredients.
            int ingredientes = firstInputInt[1];
            
            // Integer B indicating the quantity of cake types.
            int cakeTypes = firstInputInt[2];

            // Line with I integers indicating the price of each ingredient.
            String pricesInput = sc.nextLine();
            
            int[] prices = Arrays.stream(pricesInput.split(" ")).mapToInt(Integer::parseInt).toArray();

            // Get the composition of each cake type.
            // ArrayList<String> cakes = new ArrayList<String>();

            int max = 0;
            
            for (int j = 0; j < cakeTypes; j++) {
                // Get how many different ingredients, ingredient index, and ingredient amount.
                String cakeComposition = sc.nextLine();

                int different = Integer.valueOf(cakeComposition.charAt(0));
                int index = Integer.valueOf(cakeComposition.charAt(2));
                int amount = Integer.valueOf(cakeComposition.charAt(4));

                // Calculate the number of cakes
                int numberCakes = (int) (cash / (amount * prices[index])); 

                
                // cakes.add(thirdInput);
            }


        }

        sc.close();
    }
}

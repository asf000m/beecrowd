package beecrowd_1608_marias_cakes;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        sc.nextLine();

        String output = "";
        
        for (int i = 0; i < testCases; i++){

            // Line with D, I and B (cash, ingredientes and cake types);
            String firstInput = sc.nextLine();
            int[] firstInputInt = Arrays.stream(firstInput.split(" ")).mapToInt(Integer::parseInt).toArray();

            // Integer D indicating the cash Maria has to spend.
            int cash = firstInputInt[0];
            
            // Integer I indicating the number of existent ingredients.
            int ingredients = firstInputInt[1];
            
            // Integer B indicating the quantity of cake types.
            int cakeTypes = firstInputInt[2];

            // Line with I integers indicating the price of each ingredient.
            String pricesInput = sc.nextLine();
            int[] prices = Arrays.stream(pricesInput.split(" ")).mapToInt(Integer::parseInt).toArray();            

            int max = 0;
            
            for (int j = 0; j < cakeTypes; j++) {

                // Get how many different ingredients, ingredient index, and ingredient amount.
                String cakeCompositionInput = sc.nextLine();
                int[] cakeComposition = Arrays.stream(cakeCompositionInput.split(" ")).mapToInt(Integer::parseInt).toArray();
                
                int different = cakeComposition[0];
                
                int ingredientIdx = 1;
                int amountIdx = 2;
                
                double cakePrice = 0;
                double ingredientPrice;
                
                for (int k = 0; k < different; k++) {

                    // Calculate the price of each ingredient.
                    int index = cakeComposition[ingredientIdx];
                    int amount = cakeComposition[amountIdx];
    
                    ingredientPrice = amount * prices[index];
                    cakePrice += ingredientPrice;

                    // Change to the next pair of ingredient/amount.
                    ingredientIdx += 2;
                    amountIdx += 2;
                }

                // Calculate the number of cakes
                int numberCakes = (int) (cash / cakePrice);

                if (numberCakes > max) {
                    max = numberCakes;
                }
            }
            
            if ("".equals(output))
                output = output.concat(String.valueOf(max));
            else
                output = output.concat("\n" + String.valueOf(max));

        }

        System.out.println(output);

        sc.close();
    }
}

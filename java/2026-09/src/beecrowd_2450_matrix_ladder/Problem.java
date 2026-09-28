package beecrowd_2450_matrix_ladder;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, columns;
        ArrayList<int[]> matrix = new ArrayList<>();
        boolean isStair = true;

        rows = sc.nextInt();
        columns = sc.nextInt();

        // Get each row of numbers.
        for (int row = 0; row < rows; row++) {
            int[] numbers = new int[columns];
            
            for (int column = 0; column < columns; column++) {
                numbers[column] = sc.nextInt();
            }

            matrix.add(numbers);
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                
                int pivot = matrix.get(row)[column];
                int sumBelow = 0;
                int sumBelowLeft = 0;

                if (pivot != 0) {
                    
                    if (column == 0) {
                        // Check sum of numbers below pivot.
                        for (int y = row + 1; y < rows; y++) {
                            sumBelow += matrix.get(y)[column];
                        }
                    } else {
                        // Check sum of numbers below pivot.
                        for (int y = row + 1; y < rows; y++) {
                            sumBelow += matrix.get(y)[column];
                        }
                        // Check sum of numbers below and to the left of pivot.
                        for (int y = row + 1; y < rows; y++) {
                            sumBelowLeft += matrix.get(y - 1)[column - 1];
                        }
                    }
    
                    if (sumBelow != 0 || sumBelowLeft != 0) {
                        isStair = false;
                    }

                    break;
                }
            }
        }

        System.out.println(isStair ? "S" : "N");

        sc.close();
    }
}

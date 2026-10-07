package beecrowd_2450_matrix_ladder;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, columns, input, lastPivot = -1, pivot = -1;
        boolean stair = true, zeroRow = false;
        
        rows = sc.nextInt();
        columns = sc.nextInt();
        
        
        for (int i = 0; i < rows; i++) {
            
            pivot = -1;
            
            for (int j = 0; j < columns; j++) {
                input = sc.nextInt();
                
                if (input != 0 && pivot == -1) {
                    pivot = j;
                }
            }

            if (pivot == -1)
                zeroRow = true;
            else {
                if (zeroRow || pivot <= lastPivot)
                    stair = false;
                
                lastPivot = pivot;
            }
        }

        System.out.println(stair ? "S" : "N");

        sc.close();
    }
}

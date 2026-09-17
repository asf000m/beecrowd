package beecrowd_2419_coast;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int rows;
        int columns;
        int coastSquares = 0;
        String[] rowsColumns;

        String charCurrent;
        String charUp;
        String charRight;
        String charDown;
        String charLeft;

        
        rowsColumns = sc.nextLine().split(" ");
        rows = Integer.parseInt(rowsColumns[0]);
        columns = Integer.parseInt(rowsColumns[1]);
        
        String[] grid = new String[rows];

        for (int i = 0; i < rows; i++) {
            grid[i] = sc.nextLine();
        }

        for (int row = 0; row < rows; row++) {
            
            // Check in the first or last rows.
            if (row == 0 || row == rows - 1) {
                coastSquares += grid[row].length() - grid[row].replace("#", "").length();
            }
            // Check in the other rows.
            else {
                for (int column = 0; column < columns; column++) {
                    
                    charCurrent = Character.toString(grid[row].charAt(column));
                    
                    // Check in the first or last columns.
                    if (column == 0 || column == columns - 1) {
                        if ("#".equals(charCurrent))
                            coastSquares++;
                    }
                    // Check in the other columns.
                    else {
                        if ("#".equals(charCurrent)) {
                            
                            charUp = Character.toString(grid[row - 1].charAt(column));
                            charRight = Character.toString(grid[row].charAt(column + 1));
                            charDown = Character.toString(grid[row + 1].charAt(column));
                            charLeft = Character.toString(grid[row].charAt(column - 1));
                            
                            // Check if character up is water.
                            if (".".equals(charUp))
                                coastSquares++;
                            
                            // Check if character right is water.
                            else if (".".equals(charRight))
                                coastSquares++;
    
                            // Check if character down is water.
                            else if (".".equals(charDown))
                                coastSquares++;
                            
                            // Check if character left is water.
                            else if (".".equals(charLeft))
                                coastSquares++;
                        }
                    }
                }
            }
        }

        System.out.println(coastSquares);

        sc.close();
    }
}

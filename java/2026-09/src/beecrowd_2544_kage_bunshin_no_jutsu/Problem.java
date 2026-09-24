package beecrowd_2544_kage_bunshin_no_jutsu;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String testCase;
        int copies;
        double timesUsed;
        boolean eof = false;

        while (sc.hasNextLine()) {
            testCase = sc.nextLine();
            
            copies = Integer.parseInt(testCase);
            timesUsed = Math.log(copies) / Math.log(2);
            System.out.println((int) timesUsed);
        }

        sc.close();
    }
}

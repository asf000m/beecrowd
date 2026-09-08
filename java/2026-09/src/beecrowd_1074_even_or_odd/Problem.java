package beecrowd_1074_even_or_odd;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            
            int input = sc.nextInt();
    
            if (input == 0) {
                System.out.println("NULL");
            }
            else {
                if (input % 2 == 0) {
                    if (input < 0)
                        System.out.println("EVEN NEGATIVE");
                    else
                        System.out.println("EVEN POSITIVE");
                }
                else {
                    if (input < 0)
                        System.out.println("ODD NEGATIVE");
                    else
                        System.out.println("ODD POSITIVE");
                }
            }
        }

        sc.close();
    }
}

package beecrowd_3241_ajude_um_candidato_phd;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases, op1, op2;
        String input;
        String[] inputSplitted;

        testCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCases; i++) {

            input = sc.nextLine();

            if ("P=NP".equals(input)) {
                System.out.println("skipped");
            }
            else {
                inputSplitted = input.split("\\+");
                op1 = Integer.parseInt(inputSplitted[0]);
                op2 = Integer.parseInt(inputSplitted[1]);

                System.out.println(op1 + op2);
            }
        }
        
        sc.close();
    }
}

package beecrowd_2906_database_of_clients;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emails = sc.nextInt(); sc.nextLine();

        ArrayList<String> cleanEmails = new ArrayList<>();
        
        int diffEmails = 0;

        for (int i = 0; i < emails; i++) {

            String email = sc.nextLine();
            
            int atIdx = email.indexOf("@");
            
            String localpart = email.substring(0, atIdx);
            String cleanLocalpart = localpart.replaceAll("\\.", "");
            
            String provider = email.substring(atIdx + 1);
            
            String cleanEmail =cleanLocalpart + "@" + provider;
            
            if (!cleanEmails.contains(cleanEmail)) {
                diffEmails++;
                cleanEmails.add(cleanEmail);
            }

        }

        System.out.println(cleanEmails);
        System.out.println(diffEmails);

        sc.close();
    }
}

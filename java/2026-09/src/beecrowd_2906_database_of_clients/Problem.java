package beecrowd_2906_database_of_clients;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> cleanEmails = new ArrayList<>();
        String email;
        int numberEmails;
        int atIdx;
        int plusIdx;
        String localpart;
        String cleanLocalpart;
        String provider;
        String cleanEmail;
        
        numberEmails = sc.nextInt(); sc.nextLine();
        
        for (int i = 0; i < numberEmails; i++) {

            email = sc.nextLine();
            
            atIdx = email.indexOf("@");
            
            localpart = email.substring(0, atIdx);
            cleanLocalpart = localpart.replaceAll("\\.", "");
            
            plusIdx = cleanLocalpart.indexOf("+");
            if (plusIdx != -1)
                cleanLocalpart = cleanLocalpart.substring(0, plusIdx);
            
            provider = email.substring(atIdx + 1);
            cleanEmail = cleanLocalpart + "@" + provider;
            
            if (!cleanEmails.contains(cleanEmail))
                cleanEmails.add(cleanEmail);
        }

        // System.out.println(cleanEmails);
        System.out.println(cleanEmails.size());

        sc.close();
    }
}

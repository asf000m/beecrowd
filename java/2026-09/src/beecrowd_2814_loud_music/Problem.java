package beecrowd_2814_loud_music;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int testCases, maxSoundIntensity, mapLines, fX, jX;
        String[] kjInputs;
        String mapLine;
        int[] fCoordinates = new int[2];
        int[] jCoordinates = new int[2];
        double side1, side2, hypotenuse, maxVolume;


        testCases = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < testCases; i++) {

            kjInputs = sc.nextLine().split(" ");

            maxSoundIntensity = Integer.parseInt(kjInputs[0]);
            mapLines = Integer.parseInt(kjInputs[1]);

            for (int y = 0; y < mapLines; y++) {
                mapLine = sc.nextLine();

                // Check if F or J is in the input line string and get their
                // coordinates.
                fX = mapLine.indexOf("F");
                if (fX != -1) {
                    fCoordinates[0] = fX + 1;
                    fCoordinates[1] = y + 1;
                }

                jX = mapLine.indexOf("J");
                if (jX != -1) {
                    jCoordinates[0] = jX + 1;
                    jCoordinates[1] = y + 1;
                }
            }

            // Calculate the distance between F and J with the Pythagorean
            // theorem.

            // |fX - jX|
            side1 = Math.abs((fCoordinates[0] - jCoordinates[0]));
            side1 *= 10;
            // |fY - jY|
            side2 = Math.abs((fCoordinates[1] - jCoordinates[1]));
            side2 *= 10;

            hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

            maxVolume = maxSoundIntensity / Math.pow(0.99, (int) hypotenuse);
            maxVolume = Math.floor(maxVolume);

            System.out.printf("%.0f dBs\n", maxVolume);
        }

        sc.close();
    }
}

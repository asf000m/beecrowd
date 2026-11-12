package beecrowd2178lagoaazul;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int voltas = 0, numeroLocais, numeroAves, qntPosicoesAve;
        ArrayList<Integer> posicoesAve = new ArrayList<>();

        
        numeroAves = input.nextInt();
        numeroLocais = input.nextInt();

        for (int i = 0; i < numeroAves; i++) {
            qntPosicoesAve = input.nextInt();

            for (int j = 0; j < qntPosicoesAve; j++) {
                int posicao = input.nextInt();
                posicoesAve.add(posicao);
            }

            do { 
                
                for (int k = 0; k < numeroLocais; k++) {
                    if (!posicoesAve.isEmpty() && posicoesAve.get(0) == k) {
                        posicoesAve.remove(0);
                    }
                }
                
                voltas += 1;

            } while (!posicoesAve.isEmpty());
        }

        System.out.println(voltas);

        input.close();
    }
}

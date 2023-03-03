package iniciante.problem1160;

import java.util.Locale;
import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int pA;
        int pB;
        int years;
        double g1;
        double g2;
        while ( t < 1 || t >3000){
            t = sc.nextInt();
        }
        for (int i = 0; i < t; i++){
            years = 0;
            pA = sc.nextInt();
            pB = sc.nextInt();
            g1 = sc.nextDouble();
            g2 = sc.nextDouble();
            while (pA <= pB){
                pA += pA * (g1/100);
                pB += pB * (g2/100);
                years++;
                if(years > 100){
                    break;
                }
            }

            if(years > 100){
                System.out.println("Mais de 1 seculo.");

            }else {
                System.out.println(years+" anos.");
            }

        }
        sc.close();
    }
}

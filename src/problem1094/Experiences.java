package problem1094;

import java.util.Locale;
import java.util.Scanner;

public class Experiences {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int amount = 0;
        int mouse = 0;
        int frog = 0;
        int rabbit = 0;
        char tipes;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            amount = sc.nextInt();
            while ((amount < 1) || (amount > 15)){
                amount = sc.nextInt();
            }
            tipes = sc.next().charAt(0);
            if((tipes == 'c') || (tipes == 'C')){
                rabbit += amount;
            } else if ((tipes == 'r') || (tipes == 'R')) {
                mouse += amount;
            } else if ((tipes == 's') || (tipes == 'S')) {
                frog += amount;
            }
            total += amount;
        }
        double rabbitPercentage = ((double) rabbit / total) * 100.0;
        double mousePercentage = ((double) mouse / total) * 100.0;
        double frogPercentage = ((double) frog / total) * 100.0;

        System.out.println("Total: " + total + " cobaias" );
        System.out.println("Total de coelhos: " + rabbit );
        System.out.println("Total de ratos: " + mouse );
        System.out.println("Total de sapos: " + frog );
        System.out.printf("Percentual de coelhos: %.2f", rabbitPercentage);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", mousePercentage);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", frogPercentage);
        System.out.println(" %");
    }
}

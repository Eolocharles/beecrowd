package iniciante.problem1184;

import java.util.Locale;
import java.util.Scanner;

public class BelowTheMainDiagonal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] n;
        n = new double[12][12];
        double sum = 0;

        char t = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < i) {
                    sum += n[i][j];
                }
            }
        }
        if( t == 'S'){
            System.out.println(String.format("%.1f", sum));
        }else {
            System.out.println(String.format("%.1f", sum/66.0));
        }

        sc.close();
    }

}


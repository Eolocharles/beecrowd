package iniciante.problem1185;

import java.util.Locale;
import java.util.Scanner;

public class AboveSecondaryDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] n;
        n = new double[12][12];
        double sum = 0;
        int lastColum = 11;

        char t = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < lastColum; j++) {
                sum += n[i][j];
            }
            lastColum--;
        }
        if( t == 'S'){
            System.out.println(String.format("%.1f", sum));
        }else {
            System.out.println(String.format("%.1f", sum/66.0));
        }

        sc.close();
    }

}


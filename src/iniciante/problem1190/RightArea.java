package iniciante.problem1190;

import java.util.Locale;
import java.util.Scanner;

public class RightArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] n;
        n = new double[12][12];
        double sum = 0;
        int initColum = 7;
        char t = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = sc.nextDouble();
            }
        }

        for (int i = 1; i < 11; i++) {
            if (i < 6) {
                for (int j = 11; j > 11 - i; j--) {
                    sum += n[i][j];
                }
            } else {
                for (int j = initColum; j < 12; j++) {
                    sum += n[i][j];
                }
                initColum++;
            }
        }
        if( t == 'S'){
            System.out.println(String.format("%.1f", sum));
        }else {
            System.out.println(String.format("%.1f", sum/30.0));
        }

        sc.close();
    }

}
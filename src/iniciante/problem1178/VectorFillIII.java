package iniciante.problem1178;

import java.util.Locale;
import java.util.Scanner;

public class VectorFillIII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] n;
        n = new double[100];
        n[0]= sc.nextDouble();
        for( int i = 1; i < 100; i++){
            n[i] = n[i-1]/2.0;
        }
        for (int i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
    }
}

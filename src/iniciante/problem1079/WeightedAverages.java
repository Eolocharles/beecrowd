package iniciante.problem1079;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();
            System.out.printf("%.1f",(v1 * 2.0 + v2 * 3.0 + v3 * 5.0)/10.0);
            System.out.println();
        }
    }
}

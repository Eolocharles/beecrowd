package iniciante.problem1181;

import java.util.Locale;
import java.util.Scanner;

public class LineInMatrix {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] n;
        n = new double[12][12];
        double sum = 0;
        double avg = 0;
        int l = sc.nextInt();
        char t = sc.next().toUpperCase().charAt(0);
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                n[i][j]= sc.nextDouble();
            }
        }

        if(t == 'S'){
            for(int i = 0; i < 1; i++){
                for (int j = 0; j < 12; j++){
                    sum += n[l][j];
                }
            }
            System.out.println(String.format("%.1f", sum));
        } else if (t == 'M') {
            for(int i = 0; i < 1; i++){
                for (int j = 0; j < 12; j++){
                    avg += n[l][j]/12.0;
                }
            }
            System.out.println(String.format("%.1f", avg));
        }

    }
}

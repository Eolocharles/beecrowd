package iniciante.problem1155;

import java.util.Locale;
import java.util.Scanner;

public class SequenceS {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double s = 0.0;
        for(double i = 1; i <= 100; i++){
            s += (1/i);
        }
        System.out.printf("%.2f\n",s);
    }
}

package iniciante.problem1156;

import java.util.Locale;

public class SequenceSII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double s = 1.0, i, j;
        for(i = 3.0, j =2.0; i <= 39; i+=2, j*=2){
           s += i/j;
        }
        System.out.printf("%.2f\n",s);
    }
}

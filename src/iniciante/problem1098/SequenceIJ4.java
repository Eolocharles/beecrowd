package iniciante.problem1098;

import java.util.Locale;

public class SequenceIJ4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double j = 1;
        for (double i = 0; i <= 2; i+=0.2){
            if(i == 0 || i == 1 || i > 1.8){
                System.out.printf("I=%.0f J=%.0f\n", i, j);
                System.out.printf("I=%.0f J=%.0f\n", i, j+1);
                System.out.printf("I=%.0f J=%.0f\n", i, j+2);
            }else {
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                System.out.printf("I=%.1f J=%.1f\n", i, j+1);
                System.out.printf("I=%.1f J=%.1f\n", i, j+2);
            }

            j+=0.2;
        }
    }
}



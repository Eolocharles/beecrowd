package problem1117;

import java.util.Locale;
import java.util.Scanner;

public class GradeValidation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double grade1 = sc.nextDouble();
        while (grade1 < 0 || grade1 > 10){
            System.out.println("nota invalida");
            grade1 = sc.nextDouble();
        }
        double grade2 = sc.nextDouble();

        while (grade2 < 0 || grade2 > 10){
            System.out.println("nota invalida");
            grade2 = sc.nextDouble();
        }
        System.out.println("media = "+(grade1+grade2)/2.0);
    }
}

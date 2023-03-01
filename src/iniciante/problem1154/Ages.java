package iniciante.problem1154;

import java.util.Locale;
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int age = 0,count = 0;
        double sumAge = 0, avg =0;
        while (age >= 0) {
            age = sc.nextInt();
            if(age >= 0){
                sumAge += age;
                count++;
            }
        }
        avg = sumAge / count;
        System.out.printf("%.2f", avg);
        System.out.println();

        sc.close();
    }
}
package iniciante.problem1118;

import java.util.Locale;
import java.util.Scanner;

public class GradeWithValidation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        double grade1 = 0;
        double grade2 = 0;
        while (flag == 1 ){

            grade1 = sc.nextDouble();
            while (grade1 < 0 || grade1 > 10){
                System.out.println("nota invalida");
                grade1 = sc.nextDouble();
            }
            grade2 = sc.nextDouble();
            while (grade2 < 0 || grade2 > 10){
                System.out.println("nota invalida");
                grade2 = sc.nextDouble();
            }
            double media = (grade1 + grade2) / 2;
            System.out.printf("media = %.2f\n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            flag = sc.nextInt();
            while (flag != 1 && flag != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = sc.nextInt();
            }
        }
        sc.close();
    }

}

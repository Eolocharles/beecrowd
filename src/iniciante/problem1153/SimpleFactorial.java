package iniciante.problem1153;

import java.util.Scanner;

public class SimpleFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = n;
        while (n < 0 || n > 13){
            n = sc.nextInt();
        }
        for (int i = n; i >= 2; i--) {
            factorial *= i - 1;
        }
        System.out.println(factorial);
        sc.close();
    }
}

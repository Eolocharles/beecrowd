package iniciante.problem1165;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            if(isPrime(x)){
                System.out.println(x + " eh primo");
            }else {
                System.out.println(x + " nao eh primo");
            }
        }
    }

    public static boolean isPrime(int n){
        int d;
        if(n <= 1) return  false;
        for(d = 2; d*d <= n; d++){
            if (n % d == 0) return false;
        }
        return true;
    }
}

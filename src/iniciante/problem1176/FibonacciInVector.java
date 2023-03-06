package iniciante.problem1176;

import java.util.Scanner;

public class FibonacciInVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        long[] aNArray;
        for ( int i = 0; i < t; i++ ){
            n = sc.nextInt();
            aNArray = new long[n+1];
            if ( n == 0 || n == 1){
                System.out.println("Fib(" + n + ") = " + n);
            }else {
                for(int j = 0; j <= n; j++){
                    if(j == 0 || j == 1){
                        aNArray[j] = j;
                    }else {
                        aNArray[j]= aNArray[j-1] + aNArray[j-2];
                    }
                }
                System.out.println("Fib(" + n + ") = " + aNArray[n]);
            }

        }
        sc.close();
    }

}

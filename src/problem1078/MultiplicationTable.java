package problem1078;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while ( n < 2 || n > 1000 ){
            n = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++){
            System.out.println( i+" x "+ n + " = " + i * n);
        }
        sc.close();
    }
}

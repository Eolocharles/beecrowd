package problem1143;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while ( n < 1 || n > 1000){
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++ ){
            System.out.println(i+" "+(i*i)+" "+(i*i*i));
        }
    }
}

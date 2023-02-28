package iniciante.problem1073;

import java.util.Scanner;

public class SquareOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while ( N < 5 || N > 2000){
            N = sc.nextInt();
        }
        for(int i = 1; i <= N; i++){
            if ( i % 2 == 0){
                System.out.println(i +"^2 = " + (i*i));
            }
        }


        sc.close();
    }
}

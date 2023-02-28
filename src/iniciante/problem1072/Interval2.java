package iniciante.problem1072;

import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        int out = 0;
        int n = sc.nextInt();

        while ( n < 0 || n >10000){
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            while (x < -10000 || x > 10000){
                x = sc.nextInt();
            }
            if ( x >= 10 && x <= 20  ){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}

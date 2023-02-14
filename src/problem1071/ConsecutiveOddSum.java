package problem1071;

import java.util.Scanner;

public class ConsecutiveOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        if ( x < y) {
            for(int i = x+1; i < y; i++){
                if (i % 2 != 0){
                    sum+=i;
                }
            }
        } else {
            if ( y < x){
                for(int i = y+1; i < x; i++){
                    if (i % 2 != 0){
                        sum+=i;
                    }
                }
           }
        }
        System.out.println(sum);
    }
}

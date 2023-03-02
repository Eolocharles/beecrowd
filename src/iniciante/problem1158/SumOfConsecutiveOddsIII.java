package iniciante.problem1158;

import java.util.Scanner;

public class SumOfConsecutiveOddsIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, y, sum=0;
        for( int i = 0; i < n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = 0; j < y; j++){
                if(x % 2 != 0){
                   sum+= x;
                }else {
                    j--;
                }
                x++;
            }
            System.out.println(sum);
            sum = 0;
        }
        sc.close();
    }
}

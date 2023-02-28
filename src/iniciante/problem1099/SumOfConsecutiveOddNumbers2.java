package iniciante.problem1099;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SumOfConsecutiveOddNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> sumOfOdds = new ArrayList<>();
        int sum = 0;
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++){
            sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = min(x, y)+1; j < max(x, y); j++){
                if ( j % 2 != 0 ){
                    sum+=j;
                }
            }
            sumOfOdds.add(i,sum);
        }
        for (int oddSum :sumOfOdds
             ) {
            System.out.println(oddSum);
        }

    }
}

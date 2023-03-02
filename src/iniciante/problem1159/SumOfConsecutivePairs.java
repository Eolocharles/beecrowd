package iniciante.problem1159;

import java.util.Scanner;

public class SumOfConsecutivePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  sum = 0, x = sc.nextInt();
        while(x != 0){
            for(int i = 0; i < 5; i++){
                if(x % 2 == 0){
                    sum += x;
                }else {
                    i--;
                }
                x++;
            }
            System.out.println(sum);
            sum = 0;
            x = sc.nextInt();
        }

        sc.close();
    }
}

package iniciante.problem1132;

import java.util.Scanner;

public class MultiplesOf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = Math.min(x, y); i <= Math.max(x, y); i++){
            if (i % 13 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

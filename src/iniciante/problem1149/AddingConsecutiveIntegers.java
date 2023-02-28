package iniciante.problem1149;

import java.util.Scanner;

public class AddingConsecutiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        while ( n <= 0 ){
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum += a + i;
        }
        System.out.println(sum);
    }
}

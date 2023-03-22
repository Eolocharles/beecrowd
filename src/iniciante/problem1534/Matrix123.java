package iniciante.problem1534;

import java.util.Scanner;

public class Matrix123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count;
        int count2;
        int [][] m;

        while (sc.hasNext()){
            n = sc.nextInt();
            count = 0;
            count2 = n - 1;
            m = new int[n][n];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++){
                    m[i][j] = 3;
                    m[i][count] = 1;
                    m[i][count2] = 2;
                    System.out.print(m[i][j]);
                }
                System.out.println();
                count ++;
                count2 --;
            }
            System.out.println();

        }
        sc.close();
    }
}

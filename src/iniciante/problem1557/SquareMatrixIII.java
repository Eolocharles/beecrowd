package iniciante.problem1557;

import java.util.Scanner;

public class SquareMatrixIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mat;
        while (n < 0 || n >15){
            n = sc.nextInt();
        }
        while (n != 0) {
            int t = 1;
            if(n == 3 || n == 4){
                t = 2;
            } else if (n == 5) {
                t = 3;
            } else if (n == 6 || n == 7) {
                t = 4;
            } else if (n == 8 || n == 9) {
                t = 5;
            } else if (n == 10 ) {
                t = 6;
            } else if (n == 11 || n == 12) {
                t = 7;
            } else if (n == 13 || n == 14) {
                t = 8;
            } else if (n == 15) {
                t = 9;
            }
            mat = new int[n][n];
            for ( int i = 0; i < n; i++){
                for (int j = 0; j < n; j ++){
                    if( i == 0 && j == 0){
                        mat[i][j] = 1;
                        System.out.printf("%" + t + "d", mat[i][j]);
                    }else if (j == 0) {
                        mat[i][j] = mat[i - 1][j] * 2;
                        System.out.printf("%" + t + "d", mat [i][j]);

                    }else {
                        if(j == n - 1){
                            mat[i][j]= mat[i][j-1] * 2;
                            System.out.printf(" %" + t + "d", mat[i][j]);
                        }else {
                            mat[i][j]= mat[i][j-1] * 2;
                            System.out.printf(" %" + t + "d", mat[i][j]);
                        }

                    }
                }
                System.out.println();
            }
            System.out.println();
            n = sc.nextInt();
        }
    }
}
package iniciante.problem1435;

import java.util.Scanner;

public class SquareMatrixI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0 ){
            int [][] m;
            m = new int [n][n];

            for (int k = 0; k < n; k++){
                for (int i = k; i < n; i++){
                    for (int j = k; j < n; j++) {
                        m[i][j]= k + 1;
                    }
                }
               n--;
            }


            for (int i = 0; i < m.length; i++){
                for (int j = 0; j < m.length; j++){
                    if(j == m.length - 1){
                        System.out.printf("%3d",m[i][j]);
                    }else{
                        System.out.printf("%3d",m[i][j]);
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            System.out.println();
            n = sc.nextInt();
        }
        sc.close();
    }
}

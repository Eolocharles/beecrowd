package iniciante.problem1827;

import java.util.Scanner;

public class SquareMatrix4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                n = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == n / 2 && j == n / 2){
                        System.out.print(4);
                    } else if(i >= n / 3 && i < n - n / 3 && j >= n / 3 && j < n - n / 3 ){
                        System.out.print(1);
                    } else if (i == j) {
                        System.out.print(2);
                    } else if ( i + j == n - 1 ) {
                        System.out.print(3);
                    }else {
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
            System.out.println();

        }
    }

}
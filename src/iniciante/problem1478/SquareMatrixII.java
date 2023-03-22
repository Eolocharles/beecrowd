package iniciante.problem1478;

import java.util.Scanner;

public class SquareMatrixII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        while (n > 0 ){

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if ( i == j ) {
                        if(j == n - 1){
                            sb.append(String.format("%3d",1));
                        }else {
                            sb.append(String.format("%3d",1)).append(" ");
                        }
                    } else if ( i > j ) {
                        if(j == n - 1){
                            int val = i + 1 - j;
                            sb.append(String.format("%3d",val));
                        }else{
                            int val = i + 1 - j;
                            sb.append(String.format("%3d",val)).append(" ");
                        }
                    } else if (i < j) {
                        if(j == n - 1){
                            int val = j + 1 - i;
                            sb.append(String.format("%3d",val));
                        }else{
                            int val = j + 1 - i;
                            sb.append(String.format("%3d",val)).append(" ");
                        }
                    }
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
            System.out.println();
            sb.setLength(0);

            n = sc.nextInt();
        }
        sc.close();
    }
}

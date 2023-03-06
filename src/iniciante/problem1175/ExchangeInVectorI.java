package iniciante.problem1175;

import java.util.Scanner;

public class ExchangeInVectorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n;
        n = new int[20];
        int[] aux;
        aux = new int[20];

        for (int i = 0; i < 20; i++){
            n[i]= sc.nextInt();
        }
        for (int j = 19; j >= 0; j-- ){
            aux[19-j]= n[j];
            System.out.println("N[" + (19-j) + "] = " + aux[19 - j]);
        }
        sc.close();

    }
}

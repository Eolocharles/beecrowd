package iniciante.problem1179;

import java.util.Scanner;

public class VectorFillIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] odd;
        int[] pair;
        odd = new int[5];
        pair = new int[5];
        int x;
        int countOdd = 0;
        int countPair = 0;

        for (int i = 0; i < 15; i++){
            x = sc.nextInt();
            if(x % 2 == 0) {
                pair[countPair] = x;
                countPair ++;
            }else {
                odd[countOdd] = x;
                countOdd++;
            }
            if( countPair == 5){
                for (int j = 0; j < 5; j++){
                    System.out.println("par[" + j + "]= " + pair[j] );
                }
                countPair = 0;
            }
            if( countOdd == 5){
                for (int j = 0; j < 5; j++){
                    System.out.println("impar[" + j + "]= " + odd[j] );
                }
                countOdd = 0;
            }
        }
        for (int i = 0; i < countOdd; i++){
            System.out.println("impar[" + i + "]= " + odd[i] );
        }
        for (int i = 0; i < countPair; i++){
            System.out.println("par[" + i + "]= " + pair[i] );
        }
    }
}

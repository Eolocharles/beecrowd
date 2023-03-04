package iniciante.problem1173;

import java.util.Scanner;

public class VectorCompletionI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n;
        n = new int[10];
        int v = sc.nextInt();
        for (int i = 0; i < 10; i++){
            if( i == 0){
                n[i] = v ;
            }else {
                n[i]= v * 2;
                v *= 2;
            }

            System.out.println("N[" + i +"] = " + n[i]);
        }
        sc.close();
    }
}

package iniciante.problem1180;

import java.util.Scanner;

public class MinorAndPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n;
        int x = sc.nextInt();
        n = new int[x];
        int minor = 0;
        int position = 0;

        for(int i = 0; i < x; i++){
            n[i]= sc.nextInt();
            if(i == 0) {
                minor = n[0];
            }
            if(minor > n[i]){
                minor = n[i];
                position = i;
            }
        }
        System.out.println("Menor valor: " + minor);
        System.out.println("Posicao: " + position);
    }
}

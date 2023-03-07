package iniciante.problem1177;

import java.util.Scanner;

public class VectorFillII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t < 2 || t > 50){
            t = sc.nextInt();
        }
        int[] anArray = new int[1000];
        for(int i = 0; i < 999; i+=t){
            for (int j = 0; j < t; j++){
                if(i+j > 999)
                    break;
                anArray[i+j]= j;
            }
        }
        for (int i = 0; i < anArray.length; i++){
            System.out.println("N[" + i + "] = " + anArray[i]);
        }
        sc.close();
    }
}

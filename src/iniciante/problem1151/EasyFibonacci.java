package iniciante.problem1151;

import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 1 || n > 46) {
            n = sc.nextInt();
        }
        int[] anArray = new int[n];
        for(int i = 0; i < n; i++){
            if ( i == 0){
                anArray[i] = 0;
            } else if ( i == 1) {
                anArray[i] = 1;
            }else{
                anArray[i]= anArray[i-2]+anArray[i-1];
            }
            if(i == n-1){
                System.out.println(anArray[i]);
            }else{
                System.out.print(anArray[i]+" ");
            }

        }

    }
}
package iniciante.problem1837;

import java.util.Scanner;

public class Prefacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b == 0){
            b = sc.nextInt();
        }
        int q = a / b;
        int r = a % b;
        if (r < 0){
            r += Math.abs(b);
            q = (a - r) / b;
        }


        System.out.println(q +" "+ r );
        sc.close();
    }
}

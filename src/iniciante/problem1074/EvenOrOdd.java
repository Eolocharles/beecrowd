package iniciante.problem1074;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 10000){
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++ ){
            int x = sc.nextInt();
            while (x < -100000000 || x > 100000000 ){
                x = sc.nextInt();
            }
            if (x == 0 ){
                System.out.println("NULL");
            } else if ( x < 0 && x % 2 == 0 ) {
                System.out.println("EVEN NEGATIVE");
            } else if (x > 0 && x % 2 == 0 ) {
                System.out.println("EVEN POSITIVE");
            } else if ( x < 0 && x % 2 != 0 ) {
            System.out.println("ODD NEGATIVE");
            } else if (x > 0 && x % 2 != 0 ) {
            System.out.println("ODD POSITIVE");
        }
        }
        sc.close();
    }
}

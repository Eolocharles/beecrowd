package iniciante.problem1789;

import java.util.Scanner;

public class SlugRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int l;
            int v;
            int bigger = 0;
            l = sc.nextInt();
            while (l < 1 || l > 500) {
                l = sc.nextInt();
            }

            for (int i = 0; i < l; i++) {
                v = sc.nextInt();
                while (v < 1 || v > 50){
                    v = sc.nextInt();
                }
                if ( v > bigger) {
                    bigger = v;
                }
            }
            if (bigger < 10) {
                System.out.println(1);
            } else if (bigger >= 10 && bigger < 20) {
                System.out.println(2);
            }else {
                System.out.println(3);
            }
        }
    }
}

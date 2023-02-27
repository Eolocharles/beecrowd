package problem1145;


import java.util.Scanner;

public class LogicSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x < 2 || x > 20 && x > y || y > 100000){
            x = sc.nextInt();
            y = sc.nextInt();
        }
        for (int i = 0; i < y; i+=x){
            for (int j = 1; j <= x; j++){
                if( j == x){
                   System.out.print(+(j+i));
                }else {
                    System.out.print(+(j + i));
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

package problem1150;

import java.util.Scanner;

public class SurpassingZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        int sum = 0;
        int count = 0;
        while ( z <= x ){
            z = sc.nextInt();
        }
        while (sum <= z){
            sum += x;
            x++;
            count++;
        }
        System.out.println(count);
    }
}

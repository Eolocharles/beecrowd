package problem1080;

import java.util.Scanner;

public class HigherAndPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int higher = -1;
        int in = 0;
        int position = 0;

        for (int i = 1; i <= 100; i++){
            in = sc.nextInt();
            if(in > higher){
                higher = in;
                position = i;
            }
        }
        System.out.println(higher);
        System.out.println(position);
    }
}

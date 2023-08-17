package iniciante.problem1847;

import java.io.IOException;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a > b && b <= c){
            System.out.println(":)");
        } else if (a < b && b >= c){
            System.out.println(":(");
        } else if (a < b && b < c && (c - b) < (b - a)){
            System.out.println(":(");
        } else if (a < b && b < c && (c - b) >= (b - a)){
            System.out.println(":)");
        } else if (a > b && b > c && (b - c) < (a - b)){
            System.out.println(":)");
        } else if (a > b && b > c && (b - c) >= (a - b)){
            System.out.println(":(");
        } else if (a == b && b < c){
            System.out.println(":)");
        } else if (a == b && b > c){
            System.out.println(":(");
        } else if (a == b && b == c){
            System.out.println(":(");
        }
    }
}

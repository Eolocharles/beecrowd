package iniciante.problem1541;

import java.util.Scanner;

public class BuildingHouses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while ((a > 0 ) || (b > 0) || (c > 0)){

        int area = a * b;
        double percentage = (double) c / 100.0;
        double totalArea = (double) area / percentage;
        double side = Math.sqrt(totalArea);

        System.out.println((int)side);

        a = sc.nextInt();
        if (a > 0){
            b = sc.nextInt();
            if(b > 0){
                c = sc.nextInt();
            }
        }else {
            break;
        }

        }
        sc.close();
    }
}

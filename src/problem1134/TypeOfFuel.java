package problem1134;

import java.util.Scanner;

public class TypeOfFuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int gas = 0;
        int diesel = 0;
        int alcohol = 0;
        while (in != 4) {
            if (in == 1) {
                alcohol++;
            } else {
                if (in == 2) {
                    gas++;
                } else {
                    if (in == 3) {
                        diesel++;
                    }
                }
            }
            in = sc.nextInt();
        }
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcohol);
            System.out.println("Gasolina: " + gas);
            System.out.println("Diesel: " + diesel);

            sc.close();
    }
}
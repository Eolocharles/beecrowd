package problem1114;

import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 2002;
        int in = sc.nextInt();
        while (in != password){
            System.out.println("Senha Invalida");
            in = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}

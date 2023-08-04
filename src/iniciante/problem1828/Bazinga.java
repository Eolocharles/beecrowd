package iniciante.problem1828;

import java.util.Objects;
import java.util.Scanner;

public class Bazinga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String sheldon;
        String raj;
        for (int i = 0; i < t; i++) {
            sheldon = sc.next();
            raj = sc.next();
            if (Objects.equals(sheldon, raj)) {
                System.out.println("Caso #" + (i + 1) + ": " + "De novo!");
            } else if (Objects.equals(sheldon, "tesoura") && Objects.equals(raj, "papel")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "tesoura") && Objects.equals(raj, "pedra")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "tesoura") && Objects.equals(raj, "lagarto")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "tesoura") && Objects.equals(raj, "Spock")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "papel") && Objects.equals(raj, "tesoura")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "papel") && Objects.equals(raj, "pedra")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "papel") && Objects.equals(raj, "lagarto")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "papel") && Objects.equals(raj, "Spock")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "pedra") && Objects.equals(raj, "Spock")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "pedra") && Objects.equals(raj, "tesoura")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "pedra") && Objects.equals(raj, "papel")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "pedra") && Objects.equals(raj, "lagarto")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "Spock") && Objects.equals(raj, "pedra")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "Spock") && Objects.equals(raj, "tesoura")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "Spock") && Objects.equals(raj, "papel")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "Spock") && Objects.equals(raj, "lagarto")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "lagarto") && Objects.equals(raj, "pedra")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "lagarto") && Objects.equals(raj, "tesoura")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Raj trapaceou!");

            }else if (Objects.equals(sheldon, "lagarto") && Objects.equals(raj, "papel")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }else if (Objects.equals(sheldon, "lagarto") && Objects.equals(raj, "Spock")) {
                System.out.println("Caso #" + (i + 1) + ": " + "Bazinga!");

            }


        }
        sc.close();
    }
}
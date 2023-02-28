package iniciante.problem1131;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grenais=0;
        int interWins=0;
        int gremioWins=0;
        int aTie=0;
        int inter = 0;
        int gremio = 0;
        int oneMore = 1;

        while(oneMore == 1){
            oneMore = 0;
            grenais++;
            inter = sc.nextInt();
            gremio = sc.nextInt();

            if (inter == gremio){
                aTie++;
            }else if (inter > gremio){
                interWins++;
            }else {
                gremioWins++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            oneMore = sc.nextInt();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + aTie);
        if(interWins == gremioWins){
            System.out.println("Nao houve vencedor");
        }else if (interWins > gremioWins){
            System.out.println("Inter venceu mais");
        }else {
            System.out.println("Gremio venceu mais");
        }

    }
}

package iniciante.problem1848;

import java.util.Objects;
import java.util.Scanner;

public class CounterCrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = "";
        int count = 0;
        int sum = 0;
        while (count < 3 ){
            in = sc.nextLine();
            if (Objects.equals(in, "caw caw")){
                count++;
                System.out.println(sum);
                sum = 0;
            } else if (Objects.equals(in, "--*")) {
               sum += 1;
            } else if (Objects.equals(in, "-*-")) {
               sum += 2;
            } else if (Objects.equals(in, "*--")) {
               sum += 4;
            } else if (Objects.equals(in, "-**")) {
               sum += 3;
            } else if (Objects.equals(in, "**-")) {
               sum += 6;
            } else if (Objects.equals(in, "*-*")) {
               sum += 5;
            } else if (Objects.equals(in, "***")) {
               sum += 7;
            }
        }

    }
}
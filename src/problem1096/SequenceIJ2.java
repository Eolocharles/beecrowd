package problem1096;

public class SequenceIJ2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i+=2){
            int j = 7;
            System.out.println("I="+i + " J="+j);
            System.out.println("I="+i + " J="+(j-1));
            System.out.println("I="+i + " J="+(j-2));
        }
    }
}

package hw7;

/**
 * Created by Poddubniy on 06.11.2015.
 */
public class task6 {
    public static void main(String[] args) {
        int[] F = new int[11];
        F[0]=1;
        F[1]=1;
        for (int n=2;n<11;n++) F[n] = F[n - 1] + F[n - 2];
        for (int i: F) System.out.print(i +"\t");
    }

}

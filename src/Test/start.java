package Test;

/**
 * Created by Poddubniy on 07.10.2015.
 */
import java.util.Scanner;

public class start {
    public static void main (String[] args) {
        System.out.print("¬ведите число: ");
        Scanner read = new Scanner (System.in);
        double input = read.nextDouble();

        newtest N = new newtest();
        N.setN(input);
        N.Calc();

    }

}
package HW2;
import java.util.Scanner;

public class exec {
    public static void main(String[] args) {
        System.out.print("¬ведите число: ");
        Scanner read = new Scanner(System.in);
        double input = read.nextDouble();

        Main N = new Main();
        N.setN(input);
        N.Calc();
        N.Sum();


        MinMax M = new MinMax();
        M.setN(input);
        M.Calc();
        M.CalcMN();

        PlusMinus O = new PlusMinus();
        O.setN(input);
        O.Calc();
        O.CalcPM();
    }
}
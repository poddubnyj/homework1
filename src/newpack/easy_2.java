package newpack;
import java.util.Scanner;
/**
 * Created by Poddubniy on 12.10.2015.
 */
public class easy_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double first = input.nextDouble();
        System.out.println("Enter second number");
        double second = input.nextDouble();

        String f = Double.toString(first);
        String s = Double.toString(second);

        String[] F = f.split(".");
        String[] S = s.split(".");


    }

}
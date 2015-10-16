package hw6;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Poddubniy on 16.10.2015.
 */
public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int secret = r.nextInt(100)+1;
        System.out.println(secret);
        System.out.println("guess the number from 0 to 100");
        Scanner input = new Scanner(System.in);
        int number;
        int i =0;
        while (i <7) {
            number = input.nextInt();
            if(number == secret){
                System.out.println("u win");
                break;
            }
            else {
                if(number > secret){
                    i++;
                    System.out.println("smaller");
                }
                else {
                    i++;
                    System.out.println("bigger");
                }
            }

        }
        System.out.println("game over");

    }

}

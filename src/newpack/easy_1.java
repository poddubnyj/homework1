package newpack;
import java.util.Scanner;
/**
 * Created by Source_it-2 on 10.10.2015.
 */
public class easy_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance (km)");
        int S = input.nextInt();
        System.out.println("Enter velocity (km/h)");
        double V = input.nextDouble();
        System.out.println();
        double x;
        int h, m ,s;
        x = (S*1000) / ((V*1000)/3600);

        h=(int)x/3600;
        m=(int) ((x-h*3600)/60);

        s=(int)(x-(h*3600)-(m*60));
        System.out.println("Travel time "+h+":"+m+":"+s);








    }
}

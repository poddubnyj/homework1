package hw7;

/**
 * Created by Poddubniy on 23.10.2015.
 */
public class task7 {
    public static void main(String[] args) {
        int i, count = 0;
        for (i=1; i<1000000; i++){
            int a = i/100000%10;
            int b = i/10000%10;
            int c = i/1000%10;
            int x = i/100%10;
            int y = i/10%10;
            int z = i%10;

            if (a+b+c==x+y+z)  count++;

        }
        System.out.println("number of lucky tickets are "+count);
    }

}

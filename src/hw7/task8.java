package hw7;

/**
 * Created by Poddubniy on 26.10.2015.
 */
public class task8 {
    public static void main(String[] args) {
        int x=0;
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++) {
            x = 123456789 << 1;
        }
        long end = System.currentTimeMillis();

        System.out.println("Took ms: " + (end - start));

        int y=0;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++) {
            y = 123456789 * 2;
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Took ms: " + (end2 - start2));

        System.out.println(x+" "+y);

    }
}

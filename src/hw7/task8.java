package hw7;

/**
 * Created by Poddubniy on 26.10.2015.
 */
public class task8 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++) {
            int x = 123456 >> 2;
        }
        long end = System.currentTimeMillis();

        System.out.println("Took ms: " + (end - start));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++) {
            int y = 123456 * 2;
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Took ms: " + (end2 - start2));


    }
}

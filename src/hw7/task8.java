package hw7;

/**
 * Created by Poddubniy on 26.10.2015.
 */
public class task8 {
    public static void main(String[] args) {

        int  HOW_MUCH = 99999999;
        long  x = 98989898989989898l;
        long z = 0;
        long s=0;

        for (int i = 0; i<HOW_MUCH; i++) {
            long start = System.currentTimeMillis();
            long y = x * 2;
            long stop = System.currentTimeMillis();
            z = z + (stop-start);


        }
        System.out.println("Took ms: " + z);


        for (int i = 0; i<HOW_MUCH; i++) {
            long start = System.currentTimeMillis();
            long y = x << 1;
            long stop = System.currentTimeMillis();
            s = s + (stop-start);


        }
        System.out.println("Took ms: " + s);





    }
}

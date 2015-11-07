package hw7;

/**
 * Created by Poddubniy on 26.10.2015.
 */
public class task8 {
    public static void main(String[] args) {

        int  HOW_MUCH = 99999999;
        long  START = 98989898989989898l;
        long start = System.currentTimeMillis();
        for (int i = 0; i<HOW_MUCH; i++) {
            long x = START * 2;
        }
        System.out.println("Took ms: " + (System.currentTimeMillis() - start));



        start = System.currentTimeMillis();
        for (int i = 0; i<HOW_MUCH; i++) {
            long x = START << 1;
        }


        System.out.println("Took ms: " + (System.currentTimeMillis() - start));

       // System.out.println(x+" "+y);

    }
}

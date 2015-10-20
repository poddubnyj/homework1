package hw7;

import java.util.Random;

/**
 * Created by user on 20.10.2015.
 */
public class task1 {
    public static void main(String[] args) {
        Random r = new Random();
        byte[] b = new byte [4];
        r.nextBytes(b);
        System.out.println("Value of byte array: " + b);
        for (byte d : b)
        System.out.println(d);
        int I = b[0] | (b[1] << 8) | (b[2] << 16) | (b[3] << 32);

        System.out.println("int" +I);
    }

}

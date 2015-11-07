package hw7;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 07.11.2015.
 */
public class addtask4 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] I = new int[r.nextInt(100)];
        for (int i=0; i<I.length;i++){
            I[i]=r.nextInt(100);
        }
        System.out.println(Arrays.toString(I));

        int x=0;
        int y=0;
        int z=0;
        for(int i : I){
            if (i>=10 && i<=20) x++;
            if (i>=30 && i<=40) y++;
            if (i>=40 && i<=50) z++;
        }
        System.out.println("10-20:"+x+" 30-40:"+y+" 40-50:"+z);
    }
}

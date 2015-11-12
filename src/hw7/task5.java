package hw7;

import java.util.Random;

/**
 * Created by user on 24.10.2015.
 */
public class task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] I = new int[8][];
        for(int i =0; i<I.length; i++){

            I[i]= new int[r.nextInt(10)+1];
            for (int j = 0; j<I[i].length; j++){
                I[i][j] = r.nextInt(10);
                System.out.print(I[i][j]+"\t");
            }
            System.out.println();

        }

    }
}

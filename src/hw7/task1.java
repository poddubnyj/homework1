package hw7;

import java.util.Random;

/**
 * Created by Poddubniy on 23.10.2015.
 */
public class task1 {
    public static void main(String[] args) {
        int [][] I = new int[8][5];
        for(int i =0; i<I.length; i++){
            for(int j=0; j<I[i].length; j++){

                I[i][j]=10 +(int)(Math.random()*((99-10)+1));
                System.out.print(I[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

package hw7;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Poddubniy on 28.10.2015.
 */
public class addtask2 {
    public static void main(String[] args) {
    int [][] I = new int[6][7];
    for(int i =0; i<I.length; i++){
        for(int j=0; j<I[i].length; j++){

            I[i][j]=(int)(Math.random()*10);
            System.out.print(I[i][j] + "\t");
        }
        System.out.println();

    }
        System.out.println("_________________________");

    Integer [] temparr = new Integer[7];
    for (int i =0; i<I.length; i++){

        for(int j=0; j<I[i].length; j++){
                temparr[j]= I[i][j];

        }

        Arrays.sort(temparr, Collections.reverseOrder());

        for (int j=0; j<I[i].length; j++){
            I[i][j] = temparr[j];

            System.out.print(I[i][j] + "\t");

        }
        System.out.println();
    }

}
}




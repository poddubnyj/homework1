package hw7;

/**
 * Created by user on 24.10.2015.
 */
public class task5 {
    public static void main(String[] args) {
        int n = (int) (Math.random()*10);
        int [][] I = new int[8][n];
        for(int i =0; i<I.length; i++){
            for(int j=0; j<I[i].length; j++){

                I[i][j]=10 +(int)(Math.random()*((99-10)+1));
                System.out.print(I[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

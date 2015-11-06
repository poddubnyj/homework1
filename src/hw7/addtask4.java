package hw7;

/**
 * Created by Poddubniy on 06.11.2015.
 */
public class addtask4 {
    public static void main(String[] args) {
        int[][] I = new int[8][5];
        for (int i = 0; i < I.length; i++) {
            for (int j = 0; j < I[i].length; j++) {

                I[i][j] = (10+(int)(Math.random()*(100-10)));
                System.out.print(I[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("========================");


        for (int i = 0; i < I.length; i++) {
            for (int j = 0; j < I[i].length; j++) {
                if(((i&1)==0)|((j&1)==0)){
                    System.out.print(I[i][j]+"\t");
                }
                else System.out.print("\t");

            }
            System.out.println();
        }
    }
}

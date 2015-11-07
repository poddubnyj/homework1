package hw7;

/**
 * Created by Poddubniy on 06.11.2015.
 */
public class addtask3 {
    public static void main(String[] args) {

        String[] S = new String[10+(int)(Math.random()*10)];
        for (int i=0; i<S.length;i++){
            S[i]=Integer.toString(10+(int)(Math.random()*(100-10)));
            System.out.print(S[i] + "\t");
        }

        System.out.println();
        int[][] I = new int[S.length][2];
        for (int i =0; i<I.length; i++){
            Integer z = Integer.valueOf(S[i]);
            int x = z/10%10;
            int y = z%10;
            for (int j=0; j<2; j++){
                I[i][j]= j==0 ? x:y;

                System.out.print(I[i][j]+" ");
            }
            System.out.println("sum "+(x+y));
        }

    }
}

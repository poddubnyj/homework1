package hw7;

/**
 * Created by Poddubniy on 23.10.2015.
 */
public class task3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 10);
        System.out.println(n);
        int[] I = new int[n];
        for (int i = 0; i < I.length; i++) {
            I[i] = (int) (Math.random() * 100);
            System.out.print(I[i] + "\t");
        }

        int max=I[0];
        int count =0;
        for (int i=0; i<I.length; i++){
            if(I[i] > max ){
                max = I[i];
                count=1;
            }
            else
            if (I[i] == max){
                count++;
            }

        }


        System.out.println("\nmax " +max+ " count "+count);
    }
}

package hw7;

/**
 * Created by Poddubniy on 23.10.2015.
 */
public class task4 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 10);
        int[] I = new int[n];
        for (int i = 0; i < I.length; i++) {
            I[i] = (int) (Math.random() * 100);
            System.out.print(I[i] + "\t");
        }
        System.out.println();
        int tmp;
        for (int i=0; i<I.length/2;i++){
            tmp=I[i];
            I[i]=I[I.length-i-1];
            I[I.length-i-1]=tmp;
        }

        for (int p : I)
        System.out.print(p +"\t");

    }
}
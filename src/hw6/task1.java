package hw6;


/**
 * Created by Poddubniy on 16.10.2015.
 */
public class task1 {
    public static void main(String[] args) {
        int I = 169090600;
        System.out.println(I);
        byte[] B = new byte[4];
        System.out.println(B[0]);
        int i, j;
        for (i=0, j=0; i<4 & j<=24; i++, j+=8){
           B[i]= (byte)( I >>> j);
           System.out.println(B[i]);
        }
    }
}

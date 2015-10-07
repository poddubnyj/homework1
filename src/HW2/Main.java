package HW2;

import java.util.Arrays;

public class Main {

    private double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void Calc () {

        String str = Double.toString(n);
        int [] array = new int [str.length()];

        for (int i=0; i<str.length(); i++) {
            if(i!=3)
                array[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println ("Сумма разрядов числа равна " +Arrays.stream(array).sum());

    }
}
package HW2;

public class Main {
    int Digits;
    int x;
    private double n;

    public void setN(double n) {
        this.n = n;
    }

    public int Calc() {

       /* String str = Double.toString(n);
        int [] array = new int [str.length()];

        for (int i=0; i<str.length(); i++) {
            //if(i!=3)
            if (String.valueOf(str.charAt(i))!=".")

                array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        System.out.println(String.valueOf(str.charAt(3)));
        System.out.println ("Сумма разрядов числа равна " +Arrays.stream(array).sum()); */

        String text = Double.toString(Math.abs(n));
        Digits = text.length() - 1;
        x =  Integer.parseInt(text.replace(".", ""));
        return x;


    }
    public void Sum (){
        int y = x;
        int z = 0;
        for (int i=0; i<Digits; i++) {
            z = z + (y % 10);
            y = y/10;
        }
        System.out.println("sum of all digits are "+z);

    }
}
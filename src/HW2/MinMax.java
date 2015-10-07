package HW2;

public class MinMax {
    private double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public void CalcMN () {

        String str = Double.toString(n);
        int [] array = new int [str.length()];

        for (int i=0; i<str.length(); i++) {
            if(i!=3)
                array[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int max = array[0];
        int min = array[0];
        for (int i=0; i<str.length(); i++) {
            if (i ==3)
                continue;
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Мин "+min + " Макс " + max);
    }
}
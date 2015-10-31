package hw9;

/**
 * Created by Poddubniy on 30.10.2015.
 */
public class main {
    public static void main(String[] args) {
        NumberWrapper w = new NumberWrapper(5);
        Integer [] arr = w.getArr();

        for (int x : arr)
            System.out.print(x + "\t");

        w.add(98);

        System.out.println();

        arr = w.getArr();

        for (int x : arr)
            System.out.print(x + "\t");

        System.out.println();

        w.remove(3);
        arr = w.getArr();

        for (int x : arr)
            System.out.print(x + "\t");


        System.out.println();
        System.out.println(w.max());
        System.out.println(w.min());
        System.out.println(w.avg());


        w.removeValue(2);
        arr=w.getArr();

        for (int x : arr)
            System.out.print(x + "\t");

    }
}

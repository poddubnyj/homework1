package HW2;

/**
 * Created by Poddubniy on 09.10.2015.
 */
public class PlusMinus extends Main{
    public void CalcPM () {

        int[] dig = Integer.toString(x).chars().map(c -> c -= '0').toArray();
       // for (int d : dig)
      //  System.out.println(d);

        int z = 0;
        for (int i = 1; i < Digits; i++) {

            if (i % 2 == 0)
                z = z - dig[i];
            else
                z = z + dig[i];

        }
        System.out.println(z+dig[0]);

    }
}

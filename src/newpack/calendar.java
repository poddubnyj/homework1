package newpack;



/**
 * Created by Poddubniy on 12.11.2015.
 */
public class calendar {

     private int[][] m = {{0, 0, 0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30, 31, 0},
                {0, 0, 0, 0, 0, 0, 0},
     };

    public void month() {
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0)
                    System.out.print(m[i][j] + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}



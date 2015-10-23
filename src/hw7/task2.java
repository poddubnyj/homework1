package hw7;

/**
 * Created by Poddubniy on 23.10.2015.
 */
public class task2 {
    public static void main(String[] args) {
        String[]hour = new String[24];
        String[]min = new String [60];
        for (int i=0; i<60; i++){
            if(i<10)
                min[i]= "0"+i;
            else
                min[i]= Integer.toString(i);

        }
        for (int i=0; i<24; i++) {
            if (i<10)
                hour[i]="0"+i;
            else
                hour[i]= Integer.toString(i);
        }

        for(int i=0; i<24; i++){
            for(int j=0; j<60; j++){
                if((hour[i].substring(0,1)).equals(min[j].substring(1,2)) && (min[j].substring(0,1)).equals(hour[i].substring(1,2)))
                    System.out.println(hour[i]+":"+min[j]);
            }
        }

    }
}

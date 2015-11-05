package hw7;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by Poddubniy on 30.10.2015.
 */

/*
Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения,
но в классе 15 человек, а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения
(от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
*/
public class addtask2_1 {



    public static void main(String[] args) {
//        int[][] arr = {{2,2},{3,3},{4,4},{5,5},{6,6},{7,7},{8,8},{9,9},{2,2},{2,3},{3,2},{4,5},{5,6},{4,7},{5,4}};//new int[15][2];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                //arr[i][j] = 2+(int)(Math.random() * (10 -2));
//
//
//
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//        for(int i=0; i< arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[i][0]*arr[i][1]==arr[j][0]*arr[j][1]){
//                    arr[i][0]=2+(int)(Math.random() * (10 -2));
//                    arr[i][1]=2+(int)(Math.random() * (10 -2));
//                }
//
//            }
//        }
//        System.out.println("_____________________");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//            }

//        int[][] arr = new int[8][];

//        for (int i=0; i<8;i++){
//
//            for (int j=0;j<8; j++){
//                if (j<i+1)
//                arr [i][j]= (i+2)*(j+2);
//                else
//                    arr [i][j]=0;
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j <= i; j++) {
//                arr[i] = new int[j + 1];
//                arr[i][j] = (i + 2) * (j + 2);
//
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------------------------");


        Random r = new Random();

        int i, j,p;
        int count = 0;

        while (count < 15) {
            for (i = 2; i < 10; i++) {
                for (j = 2; j <= i; j++) {
                    if (count >=15) break;
                    if (r.nextBoolean()) {
                        check(i,j);

                        count++;

                    }


                }
            }

        }
    }

    public static void check(int i, int j){
        int [] prod = new int[15];
        boolean c=false;

        for (int q =0; q<15;q++){
            if(prod[q]!=i*j){
                c = true;
            }
            else{
                c=false;
            }
        }
        if(c){
            Random r = new Random();
            if (r.nextBoolean()) {
                System.out.print(i + "*" + j + "\t");
            }
            else {
                System.out.print(j + "*" + i + "\t");
            }
        }
    }
}



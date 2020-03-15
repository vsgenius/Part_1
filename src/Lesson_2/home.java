package Lesson_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class home {
    public static void home_1() {
        System.out.println("home 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]<6 ) ? 0: 1;
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void home_2() {
        System.out.println("home 2");
        int[] arr = new int[8];
        int j =1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j+=3;
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void home_3(int [] arr) {
        System.out.println("home 3");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]<6 ) ? arr[i]*2: arr[i];
            System.out.print(" " + arr[i]);}
        System.out.println();
    }
    public static void home_4(int [] arr) {
        System.out.println("home 4");
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i]>min ) ? min: arr[i];
            max = (arr[i]<max ) ? max: arr[i];
            System.out.print(" " + arr[i]);}
        System.out.println();
        System.out.println("min = "+min+ " max="+ max);
    }
    public static void home_5() {
        System.out.println("home 5");
        int[][] arr = new int[5][5];
        int x = -6;
        for (int i = 0;  i < arr.length; i++){
            x++;
            int y = 0;
            for (int j = 0; j < arr.length; j++){
                y++;
                arr[i][j] = (i==j | -x==y) ? 1 : 0;
                System.out.print(" " + arr[i][j]);}
            System.out.println();
        }
        System.out.println();
    }
    public static void home_6(int [] arr) {
        String checkBalance = "False";
        System.out.println("home 6");
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            int j = arr.length - 1;
            do {
                right += arr[j];
                j--;
            } while (j > i);
            if (left == right) {
                checkBalance = "true";
                break;}
        }
        System.out.print(checkBalance);
    }
    public static void main (String[]args){
        home_1();
        home_2();
        home_3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        home_4(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7});
        home_5();
        home_6(new int[]{1, 1, 2, 2, 1});
    }

}

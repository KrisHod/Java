package Lesson18;

import java.util.Arrays;

public class Array {
    //static int [] sortirovka (int [] array) {
     //   int a;
     //  for (int i = 0; i < array.length; i++) {
      //     int min = array[i];
      //
      //     if (min < i) {
       //        min = i;
       //    }
      // }


    //}

    public static void main(String[] args) {
        int [] array = {5, 8, 1, -3, 0, 8, 2, 2};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}

package Lesson18;

import Lesson7_1.S;

public class HomeWork {
    static void showArray (String [][] array) {
        System.out.print("{");
        for(int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length-1){
                    System.out.print(array[i][j] + ",");
                }
                else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length-1){
                System.out.print("},");
            }
            else {
                System.out.print("}");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        String [][] array = {{"ok", "poka"},{"way", "hello", "bye"},{"yes", "no", "is"}};
        showArray(array);
        showArray(new String[][] {{"man", "woman", "child"}, {"hi", "name"}});


    }
}

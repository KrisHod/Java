package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork20 {
    public static ArrayList <String> abc (String ... s){
        ArrayList <String> list = new ArrayList<>();
        for (String s1:s) {
            if (!list.contains(s1)){
                list.add(s1);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(abc("poka","privet", "ok"));
    }
}

package Lesson17;

import Lesson7_1.S;

public class HomeWork {

    static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2) {
        boolean result = false;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                } else {
                    result = true;
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb3, sb4));
        System.out.println(ravenstvo(sb3, sb5));

    }

}

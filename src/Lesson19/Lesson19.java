package Lesson19;

public class Lesson19 {
    static String[] abc(String[]... array) {
        int length = 0;
        for (String[] s : array) {
            length += s.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] s : array) {
            for (String s1 : s) {
                target[count] = s1;
                count++;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        String [] arrayRes = abc(new String[]{"a", "b"}, new String[]{"c", "v", "i"}, new String[]{"f", "d", "s", "l"});
        for (String s: arrayRes){
            System.out.print(s);
        }
    }
}




package test01;

public class test19 {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char ch = 'Z';
        int i;
        for (i = 0;i < alpha.length;i++) {
            alpha[i] = ch;
            ch--;
        }
        System.out.println(alpha);
    }
}

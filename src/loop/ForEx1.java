package loop;

public class ForEx1 {
    public static void main(String[] args) {
        int num;
        int total = 0;
        for (num = 1; num <= 10; num++) {
            total = total + num;
        }
        System.out.println("1부터 10까지의 합은 "+total+"입니다.");
    }
}

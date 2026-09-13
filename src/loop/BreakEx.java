package loop;

public class BreakEx {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; sum < 100 ;i++){
            sum += i;
            if (sum > 100) {
                break;
            }
        }
        System.out.printf("i: %d\nsum: %d", i, sum);
    }
}

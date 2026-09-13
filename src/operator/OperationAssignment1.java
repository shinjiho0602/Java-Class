package operator;

public class OperationAssignment1 {
    public static void main(String[] args) {
        float val1 = 2.5f;
        float val2 = 3.5f;
        float val3 = 6.5f;
        float sum = val1 + val2 + val3;
        float avg = sum/3;
        System.out.printf("합계: %.1f",sum);
        System.out.println();
        System.out.printf("평균: %.1f",avg);
    }
}

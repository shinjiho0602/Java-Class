package operator;

public class OperationAssignment6 {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 90;
        int math = 78;
        int total = kor + eng + math;
        double avg = (float)total / 3;
        boolean pass = (avg >= 80) ? true : false;
        String result = pass ? "통과":"미통과";
        System.out.printf("합계: %d",total);
        System.out.println();
        System.out.printf("평균: %f",avg);
        System.out.println();
        System.out.printf("결과: %s",result);
    }
}

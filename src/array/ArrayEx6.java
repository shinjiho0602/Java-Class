package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{{89, 76, 100, 68, 48, 98, 56, 77, 95}, {50, 60, 70,100, 99, 88, 83, 78, 93}};
        int arr1 = 0;
        int arr2 = 0;
        for (int i = 0;i<score[0].length;i++) {
            arr1  += score[0][i];
        }
        for (int i = 0;i<score[1].length;i++) {
            arr2  += score[1][i];
        }
        System.out.printf("A반 평균: %.1f\nB반 평균: %.1f",(float)arr1/score[0].length,(float)arr2/score[1].length);
    }
}

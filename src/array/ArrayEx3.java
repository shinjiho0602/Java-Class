package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j = 0;
        for (int i = 1;i <= 10;i++) {
            if (i%2==0) {
                arr[j] = i;
                j++;
            }
        }
        for (int i = 0;i<j;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

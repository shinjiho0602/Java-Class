package array;

public class ArrayEx5 {
    public static void main(String[] args) {
        char[][] arr = new char[3][4];
        char alpha = 'A';
        for (int i = 0; i < arr.length; i++) {       // i < 3 (행 개수)
            for (int j = 0; j < arr[i].length; j++) { // j < 4 (열 개수)
                arr[i][j] = alpha++;
            }
        }
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char alpha = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = alpha++;
        }
        for (int j = 0; j < arr.length;j++) {
            System.out.print(arr[j]);
        }
    }
}

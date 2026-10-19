import java.util.Arrays;
public class Main {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] B = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        InsertionSort(B);
        System.out.println(Arrays.toString(B));
    }
}

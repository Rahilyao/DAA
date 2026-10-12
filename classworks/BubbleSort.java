//Bubble Sort
//Time: 0(n^2)
//Space: O(1)

import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    flag = true;

                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] A = {-5, 3, 2, 1, -3, -3, 7, 2, 2};

        bubbleSort(A);

        System.out.println(Arrays.toString(A));
    }
}
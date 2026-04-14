package shabbipatterns.com;

import java.util.Arrays;

public class Bubble {
    static void main(String[] args) {
        int[] arr={4,2,3,1};
        buble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void buble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            buble(arr, r, c + 1);
        } else {
            buble(arr, c - 1, 0);
        }
    }
}

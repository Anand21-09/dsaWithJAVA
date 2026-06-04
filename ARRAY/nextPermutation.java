
import java.util.*;

public class nextPermutation {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void nextPermutation(int arr[]) {
        int n = arr.length;
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            // return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
        reverse(arr, pivot + 1, n - 1);

    }

}

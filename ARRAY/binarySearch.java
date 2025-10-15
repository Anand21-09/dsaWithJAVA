
public class binarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 5, 7, 8, 9};
        binarysearch(arr, 7);
    }

    static void binarysearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + ans);
        }
    }
}

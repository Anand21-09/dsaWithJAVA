
public class binarySearchDes {

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 5, 3, 2, 1};
        binarysearch(arr, 8);
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
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("element found at index " + ans);
        }
    }
}

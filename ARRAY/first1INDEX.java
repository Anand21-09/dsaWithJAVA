
public class first1INDEX {

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int result = binarySearch(arr, 1);
        System.out.println("The first 1 is found at = " + result);

    }

    public static int binarySearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = 1;
        while (arr[end] < arr.length && arr[end] == 0) {
            start = end;
            end = end * 2;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }
}


public class ansInRange {

    public static void main(String[] args) {
        int arr[] = {2, 2, 4, 6, 8, 10, 12};
        int result = binarySearch(arr, 10, 4, 6);
        System.out.println("Ans = " + result);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        int ans = -1;
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
        return ans;
    }
}

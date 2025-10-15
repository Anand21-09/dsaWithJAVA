
public class infiniteArrayBS {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 19, 20, 25, 29, 33, 35};
        int answer = binarySearch(arr, 19);
        System.out.println("ans = " + answer);
    }

    public static int binarySearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            start = end;
            end = end * 2;
        }
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

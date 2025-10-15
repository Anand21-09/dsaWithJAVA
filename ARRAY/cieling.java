
public class cieling {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 19};
        int answer = cieling(arr, 15);
        System.out.println("ans = " + answer);
    }

    static int cieling(int arr[], int target) {
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
        return start;
    }
}

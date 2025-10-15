
public class minDiffElement {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 11, 14};
        int result = binarySearch(arr, 12);
        System.out.println("ans is : " + result);
    }

    public static int binarySearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        if (target <= arr[0]) {
            return Math.abs(arr[0] - target);
        }
        if (target >= arr[end]) {
            return Math.abs(arr[end] - target);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        int diff1 = Math.abs(arr[start] - target);
        int diff2 = Math.abs(arr[end] - target);
        if (diff1 >= diff2) {
            return arr[end];
        } else {
            return arr[start];
        }
    }
}

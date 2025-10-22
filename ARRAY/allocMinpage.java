
public class allocMinpage {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;
        int k = 2;
        int ans = findMInPages(arr, n, k);
        System.out.println("Minimum number of pages = " + ans);
    }

    public static int findMInPages(int arr[], int n, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = end + arr[i];
            if (arr[i] > start) {
                start = arr[i];
            }
        }

        int result = -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, n, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isValid(int arr[], int n, int m, int mid) {
        int currentStudent = 1;
        int pages = 0;
        for (int i = 0; i < n; i++) {
            pages += arr[i];
            if (pages > mid) {
                currentStudent++;
                pages = arr[i];
            }
            if (currentStudent > m) {
                return false;
            }
        }
        return true;
    }
}


public class kokoEatBanana {

    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 11};
        int h = 8;
        int ans = findHours(arr, 8);
        System.out.println("ans : " + ans);
    }

    public static int findHours(int[] arr, int h) {
        int n = arr.length;
        int start = 1;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = end + arr[i];
            if (arr[i] > start) {
                start = arr[i];
            }
        }
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, mid, h)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isValid(int arr[], int k, int h) {
        int hrsSpent = 0;
        for (int i = 0; i < arr.length; i++) {
            hrsSpent += arr[i] / k;
            if (arr[i] % hrsSpent != 0) {
                hrsSpent += 1;
            }
            if (hrsSpent > h) {
                return false;
            }
        }
        return true;

    }
}

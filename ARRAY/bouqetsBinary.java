
public class bouqetsBinary {

    public static void main(String[] args) {
        int arr[] = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int ans = minDays(arr, m, k);
        System.out.println("ans : " + ans);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int start = bloomDay[0];
        int end = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > end) {
                end = bloomDay[i];
            }
            if (bloomDay[i] < start) {
                start = bloomDay[i];
            }
        }
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, m, k, bloomDay)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isValid(int minDays, int m, int k, int bloomDay[]) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (minDays >= bloomDay[i]) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                total++;
                count = 0;
            }
            if (total >= m) {
                return true;
            }
        }
        return false;
    }
}


import java.util.*;

public class aggresiveCows {

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 5};
        int cows = 3;
        int ans = findCows(cows, arr);
        System.out.println("ans : " + ans);
    }

    public static int findCows(int cows, int stalls[]) {
        int n = stalls.length;
        if (n < cows) {
            return -1;
        }
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(stalls, cows, mid)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static boolean isValid(int stalls[], int cows, int minDis) {
        int cowsCount = 1;
        int lastCowDistance = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCowDistance >= minDis) {
                cowsCount++;
                lastCowDistance = stalls[i];
            }
            if (cowsCount >= cows) {
                return true;
            }
        }
        return false;
    }
}

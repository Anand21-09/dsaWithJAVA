
// public class kSumSubArrary {

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3,4};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }
import java.util.HashMap;

public class kSumSubArrary {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            int rem = sum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1};

        int k = 6;

        System.out.println(longestSubarray(arr, k));
    }
}
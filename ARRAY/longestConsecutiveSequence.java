
import java.util.*;

public class longestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);

    }

    public static int longestConsecutive(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!set.contains(num - 1)) {
                int currNum = num;
                int count = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}


public class binarysearchQues {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 6};
        int first = binarysearch(arr, 4, true);
        int last = binarysearch(arr, 4, false);
        System.out.println("total occurence of the element = " + (last - first + 1));
        if (first == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("the index of first occurence is " + first);
            System.out.println("the index of first occurence is " + last);
        }
    }

    public static int binarysearch(int arr[], int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}

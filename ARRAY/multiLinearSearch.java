
public class multiLinearSearch {

    public static void main(String[] args) {
        int arr[] = {2, 9, 3, 7, 2, 6, 7};
        multiSearch(arr, 2);
    }

    static void multiSearch(int arr[], int target) {
        int ansArray[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ansArray[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.err.println("not found");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Element found at indexes : " + ansArray[i]);
            }
        }
    }
}

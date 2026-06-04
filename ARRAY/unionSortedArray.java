
import java.util.*;

public class unionSortedArray {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5};

        ArrayList<Integer> result = UnionArr(arr1, arr2);

        System.out.println(result);
    }

    public static ArrayList<Integer> UnionArr(int arr1[], int arr2[]) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {

            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }

            i++;
        }

        while (j < arr2.length) {

            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }

            j++;
        }

        return union;
    }
}

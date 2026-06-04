
import java.util.*;

public class interSectionArray {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 5};

        ArrayList<Integer> result = interSectionArr(arr1, arr2);

        System.out.println(result);
    }

    public static ArrayList<Integer> interSectionArr(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return list;
    }
}

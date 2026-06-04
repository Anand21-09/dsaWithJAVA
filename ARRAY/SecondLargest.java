
// import java.util.*;
// public class SecondLargest {
//     public static void main(String[] args) {
//         int arr[] = {3, 1, 9, 2, 7, 6};
//         int n = arr.length;
//         Arrays.sort(arr);
//         int largest = arr[n - 1];                                                         BRUTE FORCE APPROACH
//         int secondLargest = -1;
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 secondLargest = arr[i];
//                 break;
//             }
//         }
//         System.out.println(secondLargest);
//     }
// }
// public class SecondLargest {
//     public static void main(String[] args) {
//         int arr[] = {3, 1, 9, 2, 7, 6};
//         int n = arr.length;
//         int max = arr[0];
//         for (int i = 0; i < n; i++) {                                                           BETTER APPROACH
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         int secondLargest = -1;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > secondLargest && arr[i] != max) {
//                 secondLargest = arr[i];
//             }
//         }
//         System.out.println(secondLargest);
//     }
// }
public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {3, 1, 9, 2, 7, 6};
        int n = arr.length;                                                                             //OPTIMAL APPROACH
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}

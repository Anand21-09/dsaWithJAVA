
public class findmax {

    public static void main(String[] args) {
        int arr[] = {2, 3, 9, 11, 1, 5};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println("max element is at index " + max + " and the element is " + arr[max]);
    }

}

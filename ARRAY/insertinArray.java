
public class insertinArray {

    public static void main(String[] args) {
        int array[] = {9, 3, 7, 6, 0, 0};
        insert(array, 1, 5);
        printArray(array);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
    }

    public static void insert(int arr[], int position, int element) {
        int n = arr.length;
        if (position < 0 || position > n - 1) {
            System.out.println("Can not do insertion");
            return;
        }
        for (int i = n - 2; i >= position; i--) {
            arr[i + 1] = arr[i];

        }
        arr[position] = element;
    }

}

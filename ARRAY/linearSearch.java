
public class linearSearch {

    public static void main(String[] args) {
        int array[] = {2, 3, 7, 5, 7, 9, 6};
        firstandLast(array, 7, false);
        firstandLast(array, 7, true);
    }

    public static void linearsearch(int arr[], int target) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                answer = i;
                break;
            }
        }
        System.out.println("target is found at index " + answer);
    }

    public static void firstandLast(int arr[], int target, boolean findlast) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                answer = i;
                if (findlast == false) {
                    break;
                }
            }
        }
        System.out.println("target is found at index " + answer);
    }
}

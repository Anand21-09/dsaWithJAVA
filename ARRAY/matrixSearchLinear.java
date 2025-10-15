
public class matrixSearchLinear {

    public static void main(String[] args) {
        int array[][] = {
            {2, 3, 5, 9, 3},
            {3, 7, 6, 9, 2},
            {2, 3, 5, 1, 6},
            {7, 1, 3, 8, 9}
        };
        linearsearch(array, 3, false);
        linearsearch(array, 3, true);
    }

    static void linearsearch(int arr[][], int target, boolean findlast) {
        int outerIndex = -1;
        int innerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    outerIndex = i;
                    innerIndex = j;
                    if (findlast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if (found == true) {
                break;

            }

            if (outerIndex == -1) {
                System.out.println("ELement not found");
            } else {
                System.out.println("Element found at index " + outerIndex + "," + innerIndex);
            }
        }

    }
}

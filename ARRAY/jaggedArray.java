
public class jaggedArray {

    public static void main(String[] args) {
        int jagged[][] = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[5];
        int rows = jagged.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = 10;
            }
        }
        System.out.println("Jagged array ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}

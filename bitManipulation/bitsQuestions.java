
public class bitsQuestions {

    public static void main(String[] args) {
        bitPrint(53);
        // clearLSB(53, 5);
        int res1 = clearLSB(53, 4);
        bitPrint(res1);
    }

    static void bitPrint(int number) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
        System.out.println();
    }

    static int clearLSB(int number, int bit) {
        int result = number & ~(((1 << bit + 1) - 1));
        // System.out.println("ans : " + result);
        return result;
    }

}

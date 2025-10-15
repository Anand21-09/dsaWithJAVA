
public class printbits {

    public static void main(String[] args) {
        bitPrint(13);
        // oddEven(12);
        // int check1 = setBit(5, 1);
        // bitPrint(check1);
        // int toggle1 = toggleBit(5, 0);
        // bitPrint(toggle1);
        // int unset1 = unsetBit(5, 2);
        // bitPrint(unset1);
        //powerOFtwo(32);
        // int right1 = unsetRightbit(5);
        // bitPrint(right1);
        noOFsetbits(13);
    }

    static void bitPrint(int number) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
        System.out.println();
    }

    static boolean isBitset(int number, int bit) {
        int result = number & (1 << bit);
        if (result == 0) {
            return false;
        } else {
            return true;
        }
    }

    static void oddEven(int number) {
        if (isBitset(number, 0)) {
            System.out.println("Number is odd");
        } else {
            System.out.println("number is even");
        }
    }

    static int toggleBit(int number, int bit) {
        return number ^ (1 << bit);
    }

    static int setBit(int number, int bit) {
        return number | (1 << bit);
    }

    static int unsetBit(int number, int bit) {
        return number & ~(1 << bit);
    }

    static void powerOFtwo(int number) {
        if ((number & number - 1) == 0) {
            System.out.println("number is a power of 2");
        } else {
            System.out.println("Number is not a power of 2");
        }
    }

    static int unsetRightbit(int number) {
        return (number & number - 1);
    }

    static void noOFsetbits(int number) {
        int counter = 0;
        while (number > 0) {
            number = unsetRightbit(number);
            counter++;
        }
        System.out.println("count : " + counter);
    }

}

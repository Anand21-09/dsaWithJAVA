
public class checkPowerOfTwo {

    public static void main(String[] args) {
        checkPower(8);
    }

    public static void checkPower(int number) {
        if ((number & number - 1) == 0) {
            System.out.println("number is a power of 2");
        } else {
            System.out.println("number is not a power of 2");
        }

    }
}

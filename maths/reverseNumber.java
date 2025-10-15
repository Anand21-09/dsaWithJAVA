
public class reverseNumber {

    public static void main(String[] args) {
        revNum(-158);
    }

    public static void revNum(int number) {
        int reverse = 0;
        int sign;
        if (number < 0) {
            sign = -1;
            number = -number;
        } else {
            sign = 1;
        }

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }
        reverse *= sign;
        System.out.println("ans : " + reverse);
    }
}

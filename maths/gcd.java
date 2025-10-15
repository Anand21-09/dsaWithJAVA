
public class gcd {

    public static void main(String[] args) {
        commonDiv(24, 30);
    }

    static void commonDiv(int number1, int number2) {
        int min;
        if (number1 <= number2) {
            min = number1;
        } else {
            min = number2;
        }
        while (min != 0) {
            if (number1 % min == 0 && number2 % min == 0) {
                System.out.println("ans : " + min);
                break;
            }
            min--;
        }
    }
}

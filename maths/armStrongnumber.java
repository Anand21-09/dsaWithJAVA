
public class armStrongnumber {

    public static void main(String[] args) {
        checkArm(153);
    }

    static void checkArm(int number) {
        int result = 0;
        int copy = number;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            result += (int) Math.pow(remainder, 3);
        }
        System.out.println(copy == result);

    }
}

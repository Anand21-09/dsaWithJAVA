
public class decimalTOBinary {

    public static void main(String[] args) {
        convert(13);
    }

    static void convert(int number) {
        int result = 0;
        int power = 0;
        while (number > 0) {
            int remainder = number % 2;
            number /= 2;
            result += remainder * Math.pow(10, power);
            power++;
        }
        System.out.println("ans = " + result);
    }
}

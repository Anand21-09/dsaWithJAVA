
public class binarytoDecimal {

    public static void main(String[] args) {
        conversion(11101);
    }

    public static void conversion(int number) {
        int result = 0;
        int power = 0;
        while (number > 0) {
            int remainder = number % 10;
            number /= 10;
            result += remainder * Math.pow(2, power);
            power++;
        }
        System.out.println("result = " + result);
    }
}

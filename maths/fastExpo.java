
public class fastExpo {

    public static void main(String[] args) {
        fastEx(2, 4);
    }

    public static double fastEx(int number, int power) {
        double result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result = result * number;
            }
            power /= 2;
            number = number * number;
        }
        System.out.println(result);
        return result;
    }

}


public class power {

    public static void main(String[] args) {
        Power(2, 10);
    }

    public static double Power(int number, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        System.out.println(result);
        return result;
    }
}

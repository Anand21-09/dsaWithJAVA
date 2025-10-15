
public class euclideanGCD {

    public static void main(String[] args) {
        int a = 36;
        int b = 24;
        //gcd(8, 2);
        int lcm = (a * b) / gcd(a, b);
        System.out.println("lcm : " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

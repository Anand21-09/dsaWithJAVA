
public class newtonRaphson {

    public static void main(String[] args) {
        sqRoot(36);
    }

    static void sqRoot(int number) {
        double tolerance = 0.0001;
        double root;
        double X = number;
        while (true) {
            root = 0.5 * (X + (number / X));
            double ans = X - root;
            if (ans < tolerance) {
                break;
            }
            X = root;

        }
        System.out.println("ans : " + root);
    }
}

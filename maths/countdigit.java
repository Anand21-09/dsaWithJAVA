
public class countdigit {

    public static void main(String[] args) {
        count(12455);
    }

    static void count(int number) {
        int count = 0;
        while (number > 0) {

            number /= 10;
            count++;
        }
        System.out.println("counter = " + count);
    }
}

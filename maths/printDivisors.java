
public class printDivisors {

    public static void main(String[] args) {
        divisors(24);
    }

    public static void divisors(int number) {
        int counter = 1;
        int sqroot = (int) Math.sqrt(number);
        while (sqroot >= counter) {
            if (number % counter == 0) {
                System.out.println(counter + " is a divisor of " + number);

            }
            int otherNumber = number / counter;
            if (otherNumber != counter) {
                System.out.println(otherNumber + " is a divisor of " + number);
            }
            counter++;
        }
    }
}

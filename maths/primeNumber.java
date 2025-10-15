
public class primeNumber {

    public static void main(String[] args) {
        checkPrime(9);
    }

    static void checkPrime(int number) {
        int counter = 2;
        int sqroot = (int) Math.sqrt(number);
        while (sqroot >= counter) {
            if (number % counter == 0) {
                System.out.println(number + " is not a prime number");
                return;
            }
            counter++;
        }
        System.out.println(number + " is a prime number");
    }
}

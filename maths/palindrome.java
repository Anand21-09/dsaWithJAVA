
public class palindrome {

    public static void main(String[] args) {
        checkPD(121);
    }

    static void checkPD(int number) {
        int reversedNUmber = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reversedNUmber = reversedNUmber * 10 + digit;
        }
        System.out.println(originalNumber == reversedNUmber);
    }
}

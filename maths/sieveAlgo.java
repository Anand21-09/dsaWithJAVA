
public class sieveAlgo {

    public static void main(String[] args) {
        sieve(40);
    }

    static void sieve(int number) {
        boolean num[] = new boolean[number + 1];
        for (int i = 0; i < number; i++) {
            num[i] = true;
        }
        int counter = 2;
        while (counter <= number) {
            if (num[counter] == true) {
                for (int factor = counter + counter; factor <= number; factor = factor + counter) {
                    num[factor] = false;
                }
            }
            counter++;
        }
        for (int i = 2; i <= number; i++) {
            System.out.println(i + " : " + num[i]);
        }
    }
}

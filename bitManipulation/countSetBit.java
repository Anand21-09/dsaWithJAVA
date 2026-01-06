
public class countSetBit {

    public static void main(String[] args) {
        countBit(7);
    }

    public static void countBit(int number) {
        if (number < 0) {
            number = (~number + 1);
        }
        int count = 0;
        while (number > 0) {
            number = (number & number - 1);
            count++;
        }
        System.out.println(count);
    }
}

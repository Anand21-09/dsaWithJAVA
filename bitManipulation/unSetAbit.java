
public class unSetAbit {

    public static void main(String[] args) {
        int ans = unsetBit(14, 2);
        System.out.println(ans);
    }

    public static int unsetBit(int number, int bit) {
        return number ^ (1 << bit);
    }
}

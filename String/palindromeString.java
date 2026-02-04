
public class palindromeString {

    public static void main(String[] args) {
        Boolean result = palindromeChecker("NaMAn");
        System.out.println(result);
    }

    public static boolean palindromeChecker(String input1) {
        String input = input1.toLowerCase();
        char ch[] = input.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


public class revString {

    public static void main(String[] args) {
        //reverseString("ABCD");
        //reverseString2("ABCDE");
        reverseString3("ABCDE");
    }

    public static void reverseString(String string) {
        String str = " ";
        for (int i = 0; i < string.length(); i++) {
            str = string.charAt(i) + str;
        }
        System.out.println(str);
    }

    public static void reverseString2(String string) {
        StringBuilder str = new StringBuilder(string);
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            char firstChar = string.charAt(i);
            char lastChar = string.charAt(n - 1 - i);
            str.setCharAt(i, lastChar);
            str.setCharAt(n - 1 - i, firstChar);
        }
        System.out.println(str);
    }

    public static void reverseString3(String string) {
        char ch[] = string.toCharArray();
        // for (int i = 0; i < ch.length / 2; i++) {
        //     char temp = ch[i];
        //     ch[i] = ch[ch.length - 1 - i];
        //     ch[ch.length - 1 - i] = temp;
        // }
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.print(new String(ch));
    }
}
